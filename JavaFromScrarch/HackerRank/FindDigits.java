package HackerRank;
import java.util.Scanner;
public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ::: ");
        int n = sc.nextInt();
        System.out.println("Ans = " + findDigits(n));
    }
    public static int findDigits(int n) {
        int n1 = n;
        int i = 0;
        while(n1 > 0){
            int lastElem = n1%10;
             if(lastElem == 0) continue;
             else if(n%lastElem==0) i++;
            n1 = n1/10;
        }
        return i;
    }
}
