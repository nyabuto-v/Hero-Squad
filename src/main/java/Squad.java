public class Squad {
    private String squadName;
    private int maxSize;

  public Squad(String squad_name, int squad_size, String squad_cause) {
      squadName = squad_name; 
      maxSize = Integer.parseInt(squad_size);
      squadCause = squad_size;

  }

  public String getSquadName(){
      return squadName;
  }

  public int getMaxSize(){
      return maxSize;
  }

}