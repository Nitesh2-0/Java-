package Exeception;

public class Test {
    public static void main(String[] args) {
        // finally block - it will always exeute. no need to occure eceception 
        try{
            int num = 120/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic eceception are occured.");
        }
        finally{
            System.out.println("No Exeception is present .");
        }
        System.out.println("Out of try and catch or finally block");
    }
    
}
