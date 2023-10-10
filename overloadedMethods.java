public class overloadedMethods {
    public static void main(String[] args){

        int sum = add(1, 2);
        System.out.println(sum);

        int sum2 = add(2, 3, 4);
        System.out.println(sum2);

        int sum3 = add(3, 4, 5, 6);
        System.out.println(sum3);

        double sum4 = add(3.2, 2.1);
        System.out.println(sum4);



    }

    static int add(int a, int b){
        System.out.println("Overloaded method 1");
        return a + b;
    }

    static int add(int a, int b, int c){
        System.out.println("Overloaded method 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("Overloaded method 3");
        return a + b + c + d;
    }

     static double add(double a, double b){
        System.out.println("Overloaded method (double) 4");
        return a + b;
    }
}
