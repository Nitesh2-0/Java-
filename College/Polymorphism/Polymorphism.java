package Polymorphism;
class Abstract{
      static int add(int a, int b){return a+b;}
      static int add(int a, int b, int c) {return a+b+c;}
}
class Adder{
      static int add(int a, int b){return a+b;}
      static int add(int a, int b, int c) {return a+b+c;}
}
public class Polymorphism {
      public static void main(String[] args) {
            System.out.println("Ans :: " + Adder.add(11, 11, 11));
             System.out.println("Ans :: " + Adder.add(11, 11));
      }
}
