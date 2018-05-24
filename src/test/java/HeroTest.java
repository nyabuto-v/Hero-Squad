import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Peter");
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithHeroName_String() {
    Hero myHero = new Hero("Peter");
    assertEquals("Peter", myHero.getHeroName());
  }

}