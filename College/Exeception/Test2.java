package Exeception;
public class Test2 {
    public static void main(String[] args) {
        try{
           System.out.println("First try block.");
           int num = 45/0;
           System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic eceception is occureed.");
        }
        finally{
            System.out.println("Finally block is Executed");
        }
        System.out.println("Out of try-catch finally block");
    }
}
