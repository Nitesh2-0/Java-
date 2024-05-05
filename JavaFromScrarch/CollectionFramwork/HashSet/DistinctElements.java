package CollectionFramwork.HashSet;
import java.util.*;
public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        for(Integer k : arr){
            hs.add(k);
        }
        System.out.println(hs.contains(4));
        System.out.println("ans = " + hs.size());
        String s = "adsdsdjs";
        System.out.println(s.subSequence(1,2));
    }
}
