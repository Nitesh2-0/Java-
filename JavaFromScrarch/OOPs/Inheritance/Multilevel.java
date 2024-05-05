package OOPs.Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.eat();
        rocky.breathe();
        rocky.legs = 4;
        rocky.breed = "breading";
        System.out.println(rocky.legs);
    }
}
class Animals{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;

}
class Dog extends Mammal{
    String breed;
}