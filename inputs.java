import java.util.Scanner;

public class inputs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // scanner reads until it gets /n
        //first time input entered is omar/n (the /n is enter)
        System.out.println("Enter a Name");
        // after enter is pressed the scanner is now empty
        String name = scanner.nextLine();
    
        // next time input is being entered its entered as 23/n
        // when enter is pressed it reads the 23 and scanner still has /n in it
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        // we use the nextline again here to get rid of the /n in the scanner
        scanner.nextLine();

        //now we can take another input
        System.out.println("enter your favourite food");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your favourite food is " + food);
    }
}
