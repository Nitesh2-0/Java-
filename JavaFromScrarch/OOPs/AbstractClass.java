package OOPs;
public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.walk();
        c.eat();
        System.out.println(c.color);
        Mustang my = new Mustang();

    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called..");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends  Horse{
    Mustang(){
        System.out.println("Constructor called...");
    }
}
class Chicken extends  Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}