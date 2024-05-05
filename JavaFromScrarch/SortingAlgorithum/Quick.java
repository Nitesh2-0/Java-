package SortingAlgorithum;
import java.util.Scanner;
public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        display(arr);
    }
    static void quickSort(int[] arr,int l, int r){
        if(l >= r) return;
        int piv = partition(arr,l,r);
        quickSort(arr,l,piv);
        quickSort(arr,piv+1,r);
    }
    static int partition(int[] arr, int str, int end){
        int pivot = arr[str];
        int originalIdx = 0;
        for(int i=str+1; i<pivot; i++){
            if(arr[i] < pivot)
                originalIdx++;
        }
        swap(arr,str,originalIdx);
        return originalIdx;
    }
    static void swap(int[] arr, int str, int end){
        int temp = arr[str];
        arr[str] = arr[end];
        arr[end] = temp;
    }
    static void display(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
