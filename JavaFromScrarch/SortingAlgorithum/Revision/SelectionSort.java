package SortingAlgorithum.Revision;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Element !");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        display(arr);
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[idx] > arr[j]){
                    int temp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void display(int[] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
