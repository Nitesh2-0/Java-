package CollectionFramwork;
import java.util.Arrays;
import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2};
        Arrays.sort(arr);
        HashMap<Integer,Integer> mp = new HashMap();
        for(Integer a : arr){
            if(!mp.containsKey(a)){
                mp.put(a,1);
            } else {
                mp.put(a,mp.get(a)+1);
            }
        }
        System.out.println(mp);
        int ansKey = 0, maxFreq = -1;
        for (var e : mp.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        int n = arr.length/2;
        if(n==maxFreq){
            
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
