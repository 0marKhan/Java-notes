import java.util.Scanner;

public class operators {
    public static void main(String[] args){

        //random comment
        // variable.isBlank() checks if its empty


        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game, press q or Q to quit");
        // scanner.next() for storing a single keystroke
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You have quit the game");
        }
        else{
            System.out.println("You are still playing the game");
        }
    }
}
