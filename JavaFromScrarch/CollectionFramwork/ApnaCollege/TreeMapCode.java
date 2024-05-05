package CollectionFramwork.ApnaCollege;
import java.util.HashMap;
import java.util.TreeMap;
public class TreeMapCode {
    public static void main(String[] args) {
        // Insert/remove/get ->(log(n)) |-< red black tree data structure used hai
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);
        System.out.println(tm);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        System.out.println(hm);
    }
}
