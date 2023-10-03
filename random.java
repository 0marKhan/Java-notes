import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();
        // numbers from 1 - 6
        int num = random.nextInt(6)+1;
        // random book
        boolean check = random.nextBoolean();
        // random double between 0 and 1
        double num2 = random.nextDouble();

        System.out.println("random number b/w 1 and 6: " + num);
        System.out.println("random boolean: " + check);
        System.out.println("random double between 0 and 1: " + num2);
    }
}
