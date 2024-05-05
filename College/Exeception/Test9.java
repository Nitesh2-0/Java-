package Exeception;

public class Test9 {
    static void checkEligibility(int studentage, int studentWeight) {
        if(studentWeight < 40 && studentage < 12){
            throw new ArithmeticException("Student not Eligible for registation");
        }
        else{
            System.out.println("Student is Eligibale for registration");
        }
    }
    public static void main(String[] args) {
        System.out.print("Welcome to the registration process :: ");
        checkEligibility(4, 4);
        checkEligibility(10, 40);
        System.out.println("Have a nice day.");
    }
}
