package Array;
import java.util.Scanner;
public class StrictlyGreater {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter length of array ::: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of x :: ");
        int x = sc.nextInt();
        System.out.println(strictlyGreater(arr,x));
    }
    public static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > x) count++;
        }
        return count;
    }
}
