package OOPs.Inheritance;
public class MultipleInheritance {
    public static void main(String[] args) {
        Implements i = new Implements();
        i.A();
        i.H();
        i.B();
    }
}
interface InterfaceA{
    void A();
}
interface InterfaceB{
    void B();
}
class Implements implements InterfaceA,InterfaceB{
    public void A(){
        System.out.println("A interface called...");
    }
    public void B(){
        System.out.println("B interface called...");
    }
    public void H(){
        System.out.println("Something is all..");
    }
}
