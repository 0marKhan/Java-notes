public class Inheritence {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bicycle cycle = new Bicycle();
        cycle.go();

        System.out.println(car.doors);
        System.out.println(cycle.pedals);
        
    }
}


class Vehicle{
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }
}

class Car extends Vehicle{
    int wheels=4;
    int doors=4;
}

class Bicycle extends Vehicle{
    int wheels=2;
    int pedals=2;

}