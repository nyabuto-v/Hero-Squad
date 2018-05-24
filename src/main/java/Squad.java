public class Squad {
    private String squadName;
    private int maxSize;
    private String squadCause;

  public Squad(String squad_name, String squad_size, String squad_cause) {
      squadName = squad_name; 
      maxSize = Integer.parseInt(squad_size);
      squadCause = squad_cause;

  }

  public String getSquadName(){
      return squadName;
  }

  public int getMaxSize(){
      return maxSize;
  }

}