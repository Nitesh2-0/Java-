package OOPs;
public class SuperKeywords {
    public static void main(String[] args) {
        Horse1 h = new Horse1();
        System.out.println(h.color);
    }
}
class Animal2{
    String color;
    Animal2() {
        System.out.println("Animal constructor is called..");
    }
}
class Horse1 extends Animal2{
    Horse1(){
        super.color = "White";
        System.out.println("Horse constructor is called...");
    }
}