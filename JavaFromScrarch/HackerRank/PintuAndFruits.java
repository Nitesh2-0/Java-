package HackerRank;
import java.util.Scanner;
public class PintuAndFruits {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,2,2};
        int[] arr2 = {7,3,9,1,1,1};
        System.out.println("Ans :: " + inMinimumRupee(arr1,arr2));
    }
    static int inMinimumRupee(int[] arr1, int[] arr2){
        int min1 = Integer.MAX_VALUE, sum=0;
        for(int i=0; i<arr1.length; i++){
            sum += arr2[i];
            for(int j=i+1; j< arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    sum += arr2[j];
                }
            }
            min1 = Math.min(sum,min1);
            sum = 0 ;
        }
        return min1;
    }
}
