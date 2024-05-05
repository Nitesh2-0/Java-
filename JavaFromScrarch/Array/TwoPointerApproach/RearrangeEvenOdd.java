package Array.TwoPointerApproach;
import java.util.Scanner;
public class RearrangeEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int leng = sc.nextInt();
        int[] arr = new int[leng];
        for (int i = 0; i < leng; i++) {
            arr[i] = sc.nextInt();
        }
        rearrangeEvenOdd(arr);
        display(arr);
    }
    public static void rearrangeEvenOdd(int[] arr) {
       int str = 0 , end = arr.length-1;
       while(str <= end){
           if(arr[str]%2!=0 && arr[end]%2==0){
                  int temp = arr[str];
                  arr[str] = arr[end];
                  arr[end] = temp;
                  str++; end--;
           }
           if(arr[str]%2 == 0){
               str++;
           }
           if(arr[end]%2 != 0){
               end--;
           }
       }
    }
    public static void display (int[] arr){
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}
