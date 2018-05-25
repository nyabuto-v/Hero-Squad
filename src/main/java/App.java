
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    ProcessBuilder process = new ProcessBuilder();
     Integer port;
     if (process.environment().get("PORT") != null) {
         port = Integer.parseInt(process.environment().get("PORT"));
     } else {
         port = 4567;
     }

    setPort(port);

    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
          model.put("squads", Squad.all());
        model.put("heroes", Hero.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/squad/:id", (request, response) -> {
         Map<String, Object> model = new HashMap<String, Object>();
         Squad squadMembers = Squad.find(Integer.parseInt(request.params(":id")));
         model.put("squadMembers", squadMembers);
         model.put("template", "templates/squad.vtl");
         return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    post("/createSquad", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
        String squad_name = request.queryParams("squad_name");
        String squad_size = request.queryParams("squad_size");
        String squad_cause = request.queryParams("squad_cause");
        Squad newSquad = new Squad(squad_name,squad_size,squad_cause);
        model.put("squads", Squad.all());
        model.put("heroes", Hero.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/createHero", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
        String hero_name = request.queryParams("hero_name");
        String hero_age = request.queryParams("hero_age");
        String hero_special_power = request.queryParams("hero_special_power");
        String hero_weakness = request.queryParams("hero_weakness");
        int hero_squad = Integer.parseInt(request.queryParams("hero_squad"));
        Squad newMember = Squad.find(hero_squad);
        Hero newHero = new Hero(hero_name,hero_age,hero_special_power,hero_weakness,hero_squad);
        newMember.save(newHero);
        model.put("squads", Squad.all());
        model.put("heroes", Hero.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
