import java.util.*;


public class Hero {
    private String heroName;
    private Int heroAge;
    private String specialPower;
    private String heroWeakness;
    private String heroSquad;

  public Hero(String hero_name, int hero_age, String special_power, String hero_weakness, String hero_squad) {
      heroName = hero_name;
      heroAge = hero_age;
      specialPower = special_power;
      heroWeakness = hero_weakness;
      heroSquad = hero_squad;

  }

  public String getHeroName(){
      return heroName;
  }

  public Int getHeroAge(){
      return heroAge;
  }

  public String getSpecialPower(){
      return specialPower;
  }

  public String getHeroWeakness(){
      return heroWeakness;
  }

  public String getHeroSquad(){
      return heroSquad;
  }

}