import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 1);
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithHeroName_String() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 2);
    assertEquals("Vice", myHero.getHeroName());
  }

  @Test
  public void Hero_instantiatesWithHeroAge_String() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 3);
    assertEquals("26", myHero.getHeroAge());
  }

  @Test
  public void Hero_instantiatesWithHeroSpecialPower_String() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 4);
    assertEquals("Wisdom", myHero.getSpecialPower());
  }

  @Test
  public void Hero_instantiatesWithHeroWeakness_String() {
    Hero myHero = new Hero("Vice", "26", "Wisdom", "Memory", 5);
    assertEquals("Memory", myHero.getHeroWeakness());
  }

}