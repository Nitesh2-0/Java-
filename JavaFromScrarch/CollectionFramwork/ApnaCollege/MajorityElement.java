package CollectionFramwork.ApnaCollege;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(var k : mp.keySet()){
            if(mp.get(k) > n/3){
                System.out.println(k);
            }
        }
        System.out.println(mp);
    }
}
