package LeetCode;

import java.util.Arrays;
import java.util.Scanner;
public class FindDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Ans = " + findDuplicateElement(arr));
    }
    public static int findDuplicateElement(int[] arr){
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]==arr[i]) return arr[i];
        }
        return -1;
    }
}
