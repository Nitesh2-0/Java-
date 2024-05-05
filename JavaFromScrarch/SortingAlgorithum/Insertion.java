package SortingAlgorithum;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
    }
    static void selection(int[] arr){
        for(int i=1; i< arr.length; i++){
            int j = i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        display(arr);
    }
    static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
