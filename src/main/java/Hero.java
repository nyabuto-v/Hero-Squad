import java.util.*;


public class Hero {
    private String heroName;
    private String heroAge;
    private String specialPower;
    private String heroWeakness;
    private int heroSquad;
    private static List<Hero> instances = new ArrayList<Hero>();

  public Hero(String hero_name, String hero_age, String special_power, String hero_weakness, int hero_squad) {
      heroName = hero_name;
      heroAge = hero_age;
      specialPower = special_power;
      heroWeakness = hero_weakness;
      heroSquad = hero_squad;
     instances.add(this);
  }

  public String getHeroName(){
      return heroName;
  }

  public String getHeroAge(){
      return heroAge;
  }

  public String getSpecialPower(){
      return specialPower;
  }

  public String getHeroWeakness(){
      return heroWeakness;
  }

  public static List<Hero> all() {
      return instances;
   }

//   public String getHeroSquad(){
//       return heroSquad;
//   }

}