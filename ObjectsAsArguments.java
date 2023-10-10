public class ObjectsAsArguments {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new Car("bmw");

        garage.park(car);
    }
}

class Garage {
    Garage(){}

    void park(Car car){
        System.out.println(car.name + " is parked");
    }
}

class Car {
    String name;

    Car(){}

    Car(String name){
        this.name = name;
    }
}