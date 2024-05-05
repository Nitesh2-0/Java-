package OOPs.Inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}
class Animal3{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Dear extends Animal3{
    void eat(){
        System.out.println("Eats Grass");
    }
}