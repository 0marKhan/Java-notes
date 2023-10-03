public class arrays {
    public static void main(String[] args){

        // normal array
        String[] cars = {"Camaro", "Shelby", "Tesla"};
        System.out.println(cars[0]);
        System.out.println();

        // dynamic array
        System.out.println("1D arrays");
        String[] players = new String[3];
        players[0] = "Kobe";
        players[1] = "Jordon";
        players[2] = "Curry";

        for(int i=0; i<players.length; i++){
            System.out.println(players[i]);
        }
        System.out.println();

        // 2D arrays
        System.out.println("2D arrays");
        String[][] fruits = new String[2][3];
        // can also be done like
        // String[][] fruits = {{"apple", "pear", "strawberry"}, {"pomegrenate", "peach", "plum"}}
        fruits[0][0] = "apple";
        fruits[0][1] = "pear";
        fruits[0][2] = "strawberry";
        fruits[1][0] = "pomegrenate";
        fruits[1][1] = "peach";
        fruits[1][2] = "plum";

        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<fruits[i].length; j++){
                System.out.println(fruits[i][j]);
            }
        }
    }
}
