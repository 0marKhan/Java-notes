public class CopyingObjInJava {
    public static void main(String[] args) {
        car c1 = new car("Nissa", "Silva", 1999);
        car c2 = new car("Toyota", "Supra", 2006);
        // c1.copy(c2);
        car c3 = new car(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        System.out.println(c1.getMake());
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
        System.out.println();

        System.out.println(c2.getMake());
        System.out.println(c2.getModel());
        System.out.println(c2.getYear());
        System.out.println();

        System.out.println("using copy constructor for car 3");
        System.out.println(c3);
        System.out.println(c3.getMake());
        System.out.println(c3.getModel());
        System.out.println(c3.getYear());
        
        
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

    // copy constructor
    car(car c){
        this.make = c.getMake();
        this.model = c.getModel();
        this.year = c.getYear();
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

    // copying object into other
    public void copy(car c){
        this.setMake(c.getMake());
        this.setModel(c.getModel());
        this.setYear(c.getYear());
    }
}
