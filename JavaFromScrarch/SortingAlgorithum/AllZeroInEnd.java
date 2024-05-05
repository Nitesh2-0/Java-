package SortingAlgorithum;
import java.util.Scanner;
public class AllZeroInEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        allZeroMovedToEnd(arr);
    }
    static void allZeroMovedToEnd(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            for (int j=0; j< arr.length-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
    }
    static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
