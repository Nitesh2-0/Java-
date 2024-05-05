package OOPs.Inheritance;

public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4 ;
        System.out.println(dobby.legs);

    }
}
class Animal2{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal1 extends  Animal2{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish1 extends Animal2{
    void walk(){
        System.out.println("swim");
    }
}
class Brid extends Animal2{
    void fly(){
        System.out.println("walks");
    }
}