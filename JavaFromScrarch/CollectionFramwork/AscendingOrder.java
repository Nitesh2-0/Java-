package CollectionFramwork;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
public class AscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> sc = new ArrayList<>();
        sc.add(1);
        sc.add(2);
        sc.add(88);
        sc.add(12);
        sc.add(22);
        sc.add(82);
        System.out.println("Normal List");
        System.out.println(sc);
        System.out.println("Sorted in ascending order");
        Collections.sort(sc);
        System.out.println(sc);
        System.out.println("Sorted in descending order");
        Collections.sort(sc, Collections.reverseOrder());
        System.out.println(sc);
        System.out.println("Remove 88 from the list");
        sc.remove(Integer.valueOf(88));
        System.out.println(sc);
    }
}
