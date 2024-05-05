package LeetCode;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Ans = " + findMissingNumber(arr));
    }
    public static int findMissingNumber(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        return (((n+1)*n)/2-totalSum);
    }
}
