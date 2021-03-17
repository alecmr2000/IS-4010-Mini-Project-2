import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int userNum;
        //Above is creating scanner and variables.

        System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:");
        //User interface.

        userNum = s.nextInt();

        ArrayList<Player> players = new ArrayList<Player>();

        for (int i = 0; i < userNum; i++) {
            players.add(new Player());
        }
        //Above is adding players to the array list.

        System.out.println("We have added " + userNum + " players to this hunt. Let’s find some eggs!");
        //User interface.

        hunt(players);
        recap(players);
        //HELP: not sure why the recap is not working.

        s.close();
    }

    static void hunt(ArrayList<Player> huntPlayers) {
        Random r = new Random();

        for (int i = 0; i < huntPlayers.size(); i++) {
            int ranNumEggs = r.nextInt(11);

            for (int x = 0; x < ranNumEggs; x++) {
                huntPlayers.get(i).foundEgg(new Egg());
            }
        }
    }
    //Above is the gameplay. Players randomly find eggs.

    static void recap(ArrayList<Player> huntPlayers){
        for (int i = 0; i < huntPlayers.size(); i++){
            System.out.println("Player " + i + " found " + huntPlayers.get(i).getNumEggs() + " eggs");
            
            huntPlayers.get(i).printBasket();
            System.out.println();
        }
    }
    //Above will outlined which players found what.

    static void stats(){
        //Anyone wanna give this a go?
    }
}