package CollectionFramwork;
import java.util.*;
public class SubArrayWithZero {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0, len = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(mp.containsKey(sum)){
                len = Math.max(len,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        System.out.println("Largest SubArray = " + len);
    }
    public static void SubArraySumEqualK(int[] arr){
        
    }
}
