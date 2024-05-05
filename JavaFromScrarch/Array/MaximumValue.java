package Array;
import java.util.Scanner;
public class MaximumValue {
    public static int maximumValue(int[] arr){
        int max = 0;
        for(Integer i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Max value is " + maximumValue(arr));
    }
}
