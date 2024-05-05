package HackerRank;
import java.util.Arrays;
import java.util.*;
public class MiniMaxiNumber {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(256741038,623958417,467905213,714532089,938071625);
        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr) {
            Collections.sort(arr);
            long min = 0, max = 0;
            for(int i=0; i<arr.size()-1; i++){
                min += arr.get(i);
            }
            for(int i=1; i<arr.size(); i++){
                max += arr.get(i);
            }
            System.out.println(min + " " + max);
        }
}
