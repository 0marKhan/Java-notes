// template that can be applied to a class
// similar to inheritence, but specifies what a class must do
// classes can apply more than one interface, interface is limited to one super


public class Interfaces {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit();
        r1.flee();

        Hawk h1 = new Hawk();
        h1.hunt();

        Fish f1 = new Fish();
        f1.flee();
        f1.hunt();
    }
}

interface Prey{
    void flee();
}

interface Predetor{
    void hunt();
}

class Rabbit implements Prey{
    @Override
    public void flee(){
        System.out.println("the rabbit is fleeing");
    }
}

class Hawk implements Predetor{
    @Override
    public void hunt(){
        System.out.println("the hawk is hunting");
    }
}

class Fish implements Predetor,Prey{
     @Override
    public void flee(){
        System.out.println("this fish is fleeing bigger fish");
    }

     @Override
    public void hunt(){
        System.out.println("this fish is hunting smaller fish");
    }
}