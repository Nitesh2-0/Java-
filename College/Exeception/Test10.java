package Exeception;

public class Test10 {
    void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Eligible for voting!");
        else {
            System.out.println("Not Eligible for voting!");
        }
    }
    public static void main(String[] args) {
        Test10 t = new Test10(); 
        try{
            t.checkAge(14);
        }
        catch(Exception e){
            System.out.println("program is end.");
        }
    }
}
