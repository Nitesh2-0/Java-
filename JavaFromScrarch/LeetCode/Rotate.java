package LeetCode;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Kth Element :: " );
        int k = sc.nextInt();
        rotate(arr,k);
    }
    public static void rotate(int[]arr, int k){
        int n=arr.length;
        if(k==0) return;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        display(arr);
    }
    public static void reverse(int[]arr, int str, int end){
        while(str<=end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++; end--;
        }
    }
    public static void display(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
