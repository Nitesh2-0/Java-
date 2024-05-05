package Array;
import java.util.Scanner;
public class Sort0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sorted(arr);
    }
    public static void sorted(int[] arr){
        int count  = 0;
        for(int k : arr){
            if(k == 0) count++;
        }
        int k = 0;
        for(int i=0; i<count; i++){
            arr[k++] = 0;
        }
        for(int j = count; j< arr.length; j++){
            arr[k++] = 1;
        }
        display(arr);
    }
    public static void display(int[] arr){
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
