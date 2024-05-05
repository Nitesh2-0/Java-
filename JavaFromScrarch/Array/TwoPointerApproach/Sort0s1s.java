package Array.TwoPointerApproach;
import java.util.Scanner;
public class Sort0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        display(arr);
    }
    public static void sort(int[] arr){
        int str = 0, end = arr.length-1;
        while(str <=  end) {
            if (arr[str] == 1 && arr[end] == 0) {
                int temp = arr[str];
                arr[str] = arr[end];
                arr[end] = temp;
                str++;
                end--;
            }
            if(arr[str] == 0){
                str++;
            }
            if(arr[end] == 1){
                end--;
            }
        }
    }
    public static void display(int[] arr){
        for (int k : arr){
            System.out.print(k + " ");
        }
    }
}
