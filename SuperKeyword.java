public class SuperKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "Smart");
        System.out.println(hero1.toString());
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + "\n" + this.age + "\n";
    }
}

class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        super(name, age);   // passes it to the supers constructor(Person)
        this.power = power;
    }

    public String toString(){
        // calls toString from Person with power
        return super.toString()+this.power; 
    }
}