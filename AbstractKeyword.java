public class AbstractKeyword {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.go();
    }
}

// abstract added for security
// cant make an abstract class
abstract class Vehicle{
    // forces us to implement this in a child class
    abstract void go(); 
}

class Car extends Vehicle{

    @Override
    void go(){
        System.out.println("the car is going");
    }
}