public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getUniquieInstance(){
    if (uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance;
  }

  public void fill(){
    if (empty){
      empty = false;
      boiled = false;
      // fill boiler with milk chocolate mixture
    }
  }

  // rest of ChocolateBoiler code...
}
