import java.util.ArrayList;

class Player{
    public int numEggs;
    public static ArrayList<String> basket = new ArrayList<String>();

    public Player(){
        numEggs = 0;
        basket.add(Egg.eggColor);
        basket.add(Egg.eggContents);
        //I'm assuming this is what we want in our array?
        //She might just want the printEgg function in the array list to include both?
    }

    public int getNumEggs(){
        return numEggs;
    }

    public static ArrayList<String>getBasket(){
        return basket;
    }

    public void printBasket(){
        
    }
}