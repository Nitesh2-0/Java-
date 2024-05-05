package Array.TwoPointerApproach;
import java.util.Scanner;
public class SortInNonDec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        int[] curr = rearrangingSquare(arr,n);
        display(curr);
    }
    public static int[] rearrangingSquare(int[] arr,int n){
        int[] brr = new int[n];
        int k = n-1;
         int str = 0 , end = n-1;
         while (str <= end){
             if(Math.abs(arr[str]) > Math.abs(arr[end])){
                 brr[k--] = arr[str]*arr[str];
                 str++;
             }
             else{
                 brr[k--] = arr[end]*arr[end];
                 end--;
             }
         }
        return brr;
    }
    public static void display(int[] arr){
        for (int k : arr){
            System.out.print(k + " ");
        }
    }
}
