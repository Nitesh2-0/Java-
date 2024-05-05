package GeeksForGeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class MaxSubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        int n = arr.length;
        System.out.println(betterComplexity(arr, n));

        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
        }

       int i=0, j=i+1;

        Map<Integer,Integer>map = new HashMap<>();
        for(int k : arr){
            if(k == 0) {
                System.out.println("YES");
                return;
            }
            if(map.containsKey(k)){
                map.put(k, map.get(k)+1);
            }else{
                map.put(k,1);
            }
        }

        for(Integer k : map.keySet()){
            int val = map.get(k);
            if(val > 1){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static boolean betterComplexity(int[] arr, int n){
        Set<Integer> st = new HashSet<>();
        int max =   0;
        for(int k : arr){
            max += k;
            if(max==0 || k == 0 || st.contains(max)) return true;
            st.add(max);
        }
        return false;
    }
}
