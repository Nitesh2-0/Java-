package CollectionFramwork.HashMap;
import java.util.HashMap;
public class Frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,3,2,1,4,1,4};
        for (int el : arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            } else{
                mp.put(el,mp.get(el)+1);
            }
        }
       int ansKey = 0, maxFreq = -1;
        for (var e : mp.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times.\n",ansKey,maxFreq);
        for (int e : mp.keySet()){
            if(mp.get(e)> maxFreq){
                maxFreq = mp.get(e);
                ansKey = e;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times.\n",ansKey,maxFreq);
    }
}
