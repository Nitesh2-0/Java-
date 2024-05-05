package Polymorphism.Eror;
public class Test {
      public static void main(String[] args) {
            try{
                  int[] a = new int[3]; 
                  // a[4] = 30/0; 
                  add(a);
            } 
            catch(ArithmeticException e){
                  System.out.println("Warning : Arithmetic Exeception");
            }
            catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("Warning : Out of Bond");
            }
            catch (Exception e){
                 System.out.println("Anothe types of Exeception is Arrived.");

            }
      }
      static void add(int[] arr) throws Exception{
            arr[6] = 99; 
            if(arr.length < 5){
                  throw new Exception("This index is not valid");
            }
          System.out.println("Inserted into the array.");
      }
}
