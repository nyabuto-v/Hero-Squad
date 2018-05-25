import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad mySquad = new Squad("Knights", "18", "Defence");
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
  public void Squad_instantiatesWithSquadName_String() {
    Squad mySquad = new Squad("Knights", "18", "Defence");
    assertEquals("Knights", mySquad.getSquadName());
  }

  @Test
  public void Squad_instantiatesWithSquadSize_String() {
    Squad mySquad = new Squad("Knights", "18", "Defence");
    assertEquals(18, mySquad.getMaxSize());
  }

  @Test
  public void Squad_instantiatesWithSquadCause_String() {
    Squad mySquad = new Squad("Knights", "18", "Defence");
    assertEquals("Defence", mySquad.getSquadCause());
  }

  @Test
  public void Squad_retrievesAllSquads_true() {
    Squad firstSquad = new Squad("Knights", "18", "Defence");
    Squad secondSquad = new Squad("Vikings", "10", "Attack");
    assertEquals(true, Squad.all().contains(firstSquad));
    assertEquals(true, Squad.all().contains(secondSquad));
  }

}
