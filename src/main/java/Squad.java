import java.util.*;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private int mId;    
   private static List<Squad> instances = new ArrayList<Squad>();
   private List<Hero> heroes;

  public Squad(String squad_name, String squad_size, String squad_cause) {
      squadName = squad_name; 
      maxSize = Integer.parseInt(squad_size);
      squadCause = squad_cause;
      instances.add(this);
      mId = instances.size();
      heroes = new ArrayList<Hero>();
  }

  public String getSquadName(){
      return squadName;
  }

  public int getMaxSize(){
      return maxSize;
  }

  public String getSquadCause(){
      return squadCause;
  }

  public int getSquadId() {
      return mId;
  }

  public static List<Squad> all(){
      return instances;
  }

  public static Squad find(int id) {
      return instances.get(id - 1);
   }

   public List<Hero> getHeroes() {
      return heroes;
   }

   public void save(Hero newHero){
         heroes.add(newHero);
   }


}