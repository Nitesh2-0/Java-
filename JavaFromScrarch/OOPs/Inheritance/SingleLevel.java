package OOPs.Inheritance;

public class SingleLevel {
    public static void main(String[] args) {
        Fish sark = new Fish();
        sark.eat();
        sark.swim();
        sark.color = "Daravna";
        System.out.println(sark.color);
    }
}
//Base clas
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//Derive class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in river");
    }
}