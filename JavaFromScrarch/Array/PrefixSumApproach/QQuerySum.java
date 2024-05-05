package Array.PrefixSumApproach;
import java.util.Scanner;
public class QQuerySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array ::: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = prefixSum(arr);
        System.out.print("Enter number of query :: ");
        int q = sc.nextInt();
        while(q-->0){
            System.out.print("Enter initial position ::");
            int l = sc.nextInt();
            System.out.print("Enter final position :: ");
            int f = sc.nextInt();

            int result = prefix[f] - prefix[l-1];
            System.out.println("Ans = "+ result);
        }
    }
    public static int[] prefixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
         }
        return arr;
    }
}
