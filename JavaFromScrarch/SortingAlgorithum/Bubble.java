package SortingAlgorithum;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        brutForce(arr,n);
        optimized(arr,n);
        display(arr);
    }
    public static void brutForce(int[] arr,int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        display(arr);
    }
    public static void optimized(int[] num, int n){
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(num[j] > num[j+1]){
                    swap(num,j,j+1);
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
    public static void swap(int[] num, int str, int end){
        int temp = num[str];
        num[str] = num[end];
        num[end] = temp;
    }
    public static void display(int[]num){
        for(Integer it : num){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
