// // Function definition with parameters (x and y)
// int add(int x, int y) {
//     return x + y;
// }

// // Calling the function with arguments (5 and 3)
// int result = add(5, 3);



public class Methods {
    public static void main(String[] args){
        String name = "Omar"; 
        hello(name);

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);
    }

    // this is made static so we can call it directly in Methods
    // if we didn't we would have to call it like this

    // public class Methods {
    // public static void main(String[] args){
    //     Methods obj = new Methods(); // Create an instance of the class
    //     obj.hello(); // Call the method using the instance
    // }

    // void hello(){ // Not static
    //     System.out.println("Hello");
    // }
    // }


    static void hello(String str){
        System.out.println(str);
    }

    static int add(int x, int y){
        return x + y;
    }
}
