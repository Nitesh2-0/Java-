package SortingAlgorithum.Revision;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element !");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        display(arr);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean b = true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    b = false;
                }
            }
            if(b) return ;
        }
    }
    public static void display(int[] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
