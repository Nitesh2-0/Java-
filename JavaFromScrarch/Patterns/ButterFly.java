package Patterns;
import java.util.Scanner;
public class ButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.println("Enter N :: ");
        int n = sc.nextInt(),i;
        for (i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            int spaces = 2 * (n - 1 - i);
            for (int j = 0; j < spaces; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (i = n-1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }

            int spaces =  2*(n-1-i);
            for (int j= 0; j < spaces; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
