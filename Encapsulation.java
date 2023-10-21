// private only withing same class
// protected if inherited by other class
// public free for all to use

public class Encapsulation {
    public static void main(String[] args) {
        car c1 = new car("Nissa", "Silva", 1999);
        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());

        c1.setMake("Toyota");
        System.out.println(c1.getMake());

    }
}

class car{
    private String make;
    private String model;
    private int year;

    car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
}