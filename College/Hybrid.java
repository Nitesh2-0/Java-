class A{
      public void display(){
            System.out.println("dis() method");
      }
}
interface Inf {
      public void show();
}
interface Inf1 {
      public void show();
}
class D extends A implements Inf,Inf1{
      public void show(){
            System.out.println("Hello");
      }
      public void displayD(){
            System.out.println("Namste");
      }
}
public class Hybrid {
      public static void main(String[] args) {
            D d = new D();
            d.display();
            d.displayD(); 
            d.show();
      }
}
