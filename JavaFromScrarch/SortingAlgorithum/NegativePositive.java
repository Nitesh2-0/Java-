package SortingAlgorithum;
import java.util.Scanner;
public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Element :: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortNegPos(arr);
    }
    static void sortNegPos(int[] num){
        int n = num.length;
        int str = 0, end = n-1;
        while(str <= end){
            if(num[str] >= 0 && num[end] < 0){
                swap(num,str,end);
                str++; end--;
            }
            else if(num[str] < 0){
                str++;
            }
            else{
                end--;
            }
        }
        display(num);
    }
    static void swap(int[] arr, int str, int end){
        int temp = arr[str];
        arr[str] = arr[end];
        arr[end] = temp;
    }
    static void display(int[] arr){
        for(int k : arr){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
