
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
          model.put("squads", Squad.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/createSquad", (request, response) -> {
      	Map<String, Object> model = new HashMap<String, Object>();
        String squad_name = request.queryParams("squad_name");
        String squad_size = request.queryParams("squad_size");
        String squad_cause = request.queryParams("squad_cause");
        Squad newSquad = new Squad(squad_name,squad_size,squad_cause);
        model.put("squads", Squad.all());
      	model.put("template", "templates/index.vtl");
      	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
