package Exeception;

public class Test11 {
    int division(int a, int b) throws ArithmeticException{
        int t = a/b; 
        return t; 
    }
    public static void main(String[] args) {
        Test11 t = new Test11(); 
        try{
            System.out.println(t.division(15, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Yo shouldn't divide number by zero.");
        }
    }
}
