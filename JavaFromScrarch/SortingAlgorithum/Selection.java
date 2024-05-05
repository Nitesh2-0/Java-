package SortingAlgorithum;
import java.rmi.server.RMIClassLoader;
import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int ln = sc.nextInt();
        int[] arr = new int[ln];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
    }
    public static void selection(int[]arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx])
                    minIdx = j;
            }
            if(minIdx != i){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
        display(arr);
    }
    static void display(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
