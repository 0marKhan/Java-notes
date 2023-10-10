public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}

class Animal{
    void speak(){
        System.out.println("The animal is speaking");
    }
}

class Dog extends Animal{
    
@Override
 void speak(){
        System.out.println("The dog is speaking");
    }
}