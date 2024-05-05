package Array;
import java.util.Scanner;
public class IsPresentTarget {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter length of array ::: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target Element :: ");
        int target = sc.nextInt();
        System.out.println(target + " is present at index " + isPresent(arr, target));
    }
    public static int isPresent(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
