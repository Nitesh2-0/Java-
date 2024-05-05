package CollectionFramwork.ApnaCollege;
import java.util.*;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("India",100);
        mp.put("China", 150);
        mp.put("US",50);
        mp.put("Indonesia",5);
        mp.put("Nepal",5);

        // Iterate <-> mp.entySet()
        Set<String> keys = mp.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println("Key = " + k + "," + "value = " + mp.get(k));
        }
    }
}
