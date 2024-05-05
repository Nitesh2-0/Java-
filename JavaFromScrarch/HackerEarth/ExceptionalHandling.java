package HackerEarth;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionalHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter X :: ");
            int x = sc.nextInt();
            System.out.print("Enter Y :: ");
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
