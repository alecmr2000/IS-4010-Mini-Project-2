import java.util.Random;

class Egg{
    public static String eggColor;
    public static String eggContents;

    public Egg(){
        eggColor = randomColor();
        eggContents = randomContents();
    }
    //When a new egg is created the above assigns it a random color and random contnets.

    public static String getColor(){
        return eggColor;
    }
    //Above is accessor method.

    public static String getContents(){
        return eggContents;
    }
    //Above is accessor method.

    String randomColor(){
        String[] Color = {"Blue", "Pink", "Yellow", "Green"};

        String randomColor = (Color[new Random().nextInt(Color.length)]);

        return randomColor;
    }
    //Above randomly picks a color for the egg.

    String randomContents(){
        String[] Contents = {"Cadbury Egg", "Reese’s Egg", "pink Starburst", "yellow Peep", "25 cents", "50 cents", "one dollar"};

        String randomContents = (Contents[new Random().nextInt(Contents.length)]);

        return randomContents;
    }
    //Above randomly picks contents for the egg. 

    public void printEgg(){
        System.out.println(eggColor + " egg contains " + eggContents);
    }
    //Above prints the egg's color and contents.
}