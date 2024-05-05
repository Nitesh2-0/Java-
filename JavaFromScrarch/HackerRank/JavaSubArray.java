package HackerRank;
import java.util.*;
public class JavaSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subArray(arr));
    }
    static int subArray(int[] num){
        int negativeSum = 0, positiveSum = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
//                if(num[j] < 0){
//                    negativeSum += num[j];
//                }
//                else{
//                    positiveSum += num[j];
//                }
                negativeSum += num[j];
            }
//            System.out.println();
        }
        System.out.println(positiveSum + " " + negativeSum);
        return Math.abs(positiveSum+negativeSum);
    }
}
