import java.util.ArrayList;

class Player {
  public int numEggs;
  public static ArrayList<Egg> basket;

  public Player() {
    numEggs = 0;
    basket = new ArrayList<Egg>();
  }
  // When a new player is created they start with zero eggs.

  public int getNumEggs() {
    return numEggs;
  }
  // Above is accessor method.

  public static ArrayList<Egg> getBasket() {
    return basket;
  }
  // Above is accessor method.

  public void printBasket() {
    for (Egg i : basket) {
      i.printEgg();
    }
  }
  // CEHCK: not sure above is corrrect code.

  public void foundEgg(Egg e) {
    numEggs++;
    basket.add(e);
  }
  // CEHCK: not sure above is corrrect code.
}