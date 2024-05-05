package Polymorphism;
class OverloadingCalculation{
      void sum(long a, int b){
            System.out.println((a+b));
      }
      void sum(int a, long b){
            System.out.println((a+b));
      }
}
public class OveloadingCalculation1 {
      public static void main(String[] args) {
            // OverloadingCalculation obj  = new OverloadingCalculation(); 
            // obj.sum(11, 20); // Ambiqyti problem
            // obj.sum(77, 88.55);
      }
}
