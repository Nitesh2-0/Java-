package CollectionFramwork;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] num, int target){
        int n = num.length;
        int[] ans = {-1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int partner = target - num[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
            } else{
                mp.put(num[i] , i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,-1};
        int target = 6;
        int[] ans = twoSum(arr,target);
        System.out.println("Ans :: "  + ans[0] + "," + ans[1]);
    }
}
