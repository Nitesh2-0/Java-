package Array.PrefixSumApproach;
import java.util.Scanner;
public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter length of array ::: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] suffix = suffixSum(arr);
        display(suffix);
    }
    public static int[] suffixSum(int[] arr){
        for(int k= arr.length-1-1; k>=0; k--){
            arr[k] = arr[k+1] + arr[k];
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int k: arr){
            System.out.print(k + " ");
        }
    }
}
