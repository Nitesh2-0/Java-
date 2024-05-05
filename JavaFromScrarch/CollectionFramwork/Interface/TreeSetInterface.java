package CollectionFramwork.Interface;
import java.util.TreeSet;
public class TreeSetInterface {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(5);
        t.add(-1);
        t.add(88);
        t.add(99);
        t.add(0);
        t.add(45);
        System.out.println(t);
    }
}
