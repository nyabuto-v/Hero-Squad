import java.util.*;

public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;
    private int mId;    
   private static List<Squad> instances = new ArrayList<Squad>();

  public Squad(String squad_name, String squad_size, String squad_cause) {
      squadName = squad_name; 
      maxSize = Integer.parseInt(squad_size);
      squadCause = squad_cause;
      instances.add(this);
      mId = instances.size();
  }

  public String getSquadName(){
      return squadName;
  }

  public int getMaxSize(){
      return maxSize;
  }

  public String getsquadCause(){
      return squadCause;
  }

  public static List<Squad> all(){
      return instances;
  }


}