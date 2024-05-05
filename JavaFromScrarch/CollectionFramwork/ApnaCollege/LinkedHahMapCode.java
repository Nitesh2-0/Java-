package CollectionFramwork.ApnaCollege;
import java.util.*;
public class LinkedHahMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
        lm.put("India",100);
        lm.put("China",150);
        lm.put("Us",50);
        System.out.println(lm);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        System.out.println(hm);

    }
}
