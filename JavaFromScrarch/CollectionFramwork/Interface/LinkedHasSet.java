package CollectionFramwork.Interface;
import java.util.*;
public class LinkedHasSet {
    public static void main(String[] args) {
       LinkedHashSet<Integer> hs = new LinkedHashSet<>();
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(88);
       hs.add(99);
        System.out.println(hs);
        System.out.println(hs.remove(99));
        System.out.println(hs.contains(99));
        hs.add(99);
        hs.add(88);
        hs.add(11);
        System.out.println(hs);
    }
}
