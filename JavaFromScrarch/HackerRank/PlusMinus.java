package HackerRank;
import java.util.*;
public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int pos=0, neg=0, zero=0;
        for(int i=0; i<n; i++){
            if(arr.get(i) > 0) {
                pos++;
            }
            else if(arr.get(i) < 0){
                neg++;
            }
            else{
                zero++;
            }
        }
        // Cast the division to double
        double posRatio = (double) pos / n;
        double negRatio = (double) neg / n;
        double zeroRatio = (double) zero / n;

        // Print the ratios with 6 decimal places
        System.out.printf("%.6f\n", posRatio);
        System.out.printf("%.6f\n", negRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }
}
