package PatternQuestion;
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines :: ");
        int n = sc.nextInt();
        makingPattern1(n);
    }
    static void makingPattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=(n-i); j>=1; j--){
                System.out.print(" ");
            }
            for(int j=n-i; j<n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
