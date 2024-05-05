package Array;
import java.util.Scanner;
public class LastOccurrence {
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
        System.out.println(lastOccurrence(arr,x));
    }
    public static int lastOccurrence(int[] arr, int x){
        int currentIdx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                currentIdx = i;
            }
        }
        return currentIdx;
    }
}
