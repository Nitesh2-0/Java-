package PatternQuestion;
import Array.SwapUsingThirdVar;

import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        int n = sc.nextInt();
        p2(n);
    }
    static void p2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
