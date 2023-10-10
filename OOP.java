


public class OOP {
    public static void main(String[] args) {
        
        Car car = new Car("Mitsubishi", "Evo L", 2004, "purple", 50000.00);
        car.data();

        // all objects have toString() from the start
        System.out.println(car.toString());

        // printing an object normally is like using the toString() method
        System.out.println(car);

    }
}

class Car {
     String make;
    String model;
    int year;
    String color;
    double price;

    Car(){}

    Car(String make, String model, int year, String color, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    void data(){
        System.out.println("car " + make + " " + model + " " + year + " with color " + color + " is priced at: " + price);
    }

    // overloading toString() function
    public String toString(){
        String myString = make + " " + model + " " + year + " " + color + " " + price;
        return myString;
    }
}
