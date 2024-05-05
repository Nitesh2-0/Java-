package Array.PrefixSumApproach;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int []prefix = runningSuM(arr);
        display(prefix);
        int [] running = runningSum(arr);
        display(running);
    }
    public static int[] runningSuM(int[] arr){
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static int[] runningSum(int[] arr){
        arr[0] = arr[0];
        for(int i=1; i< arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void display(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
