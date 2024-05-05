package Array.TwoPointerApproach;
import java.util.Scanner;
public class KthRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        System.out.print("Enter kth value :: ");
        int k = sc.nextInt();
        kthSwap(arr,k);
        display(arr);

    }
    public static void kthSwap(int[] arr, int k){
        k = k % arr.length;
        swap(arr,0,k-1);
        swap(arr,k, arr.length-1);
        swap(arr,0, arr.length-1);
    }
    public static void swap(int[] arr , int str, int end){
        while (str <= end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++; end--;
        }
    }
    public static void display(int[]arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
