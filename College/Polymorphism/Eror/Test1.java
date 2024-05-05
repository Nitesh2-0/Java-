package Polymorphism.Eror;

public class Test1 {
      public static void main(String[] args) {
            try{
                  int[] arr = new int[7]; 
                  arr[10] = 10/5; 
                  System.out.println("Lat Statement of try block");
            }
            catch (Exception e){
                  System.out.println("Some other Exeception.");
            }
            // catch(ArithmeticException e){
            //       System.out.println("Arithametic Exeception.");
            // }
            // catch(ArrayIndexOutOfBoundsException e){
            //       System.out.println("Out of BVond.");
            // }
            // System.out.println("Out of the try");
      }
}
