// ability of an object to identify as more than one type

public class Polymorphism {
    public static void main(String[] args) {
        car c1 = new car();
        cycle cy = new cycle();
        boat b1 = new boat();

        vehicle[] racers = {c1, cy, b1};

        for(vehicle x:racers){
            x.go();
        }
    }
}

class vehicle{
    public void go(){};
}

class cycle extends vehicle{
    @Override
    public void go(){
        System.out.println("the cycle begins moving");
    }
}

class boat extends vehicle{
    @Override
    public void go(){
        System.out.println("the boat begins moving");
    }
}

class car extends vehicle{
    @Override
    public void go(){
        System.out.println("the car begins moving");
    }
}