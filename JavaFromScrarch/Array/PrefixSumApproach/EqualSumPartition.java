package Array.PrefixSumApproach;
import java.util.Arrays;
import java.util.Scanner;
public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(twoEqualSubArray(arr));
    }
    public static boolean twoEqualSubArray(int[] arr){
        int totalSum = findAddition(arr);
        int prefixSum = 0;
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if(suffixSum == prefixSum) return true;
        }
        return false;
    }
    public static int findAddition(int[] arr){
        int totalSum = 0;
        for(int i=0; i< arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
}
