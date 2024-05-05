package CollectionFramwork.LinkedList;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(10);
        l.add(17);
        l.add(71);
        l.add(71);
        l.add(71);
        l.add(10);
        l.add(10);
        System.out.println(l.pollFirst());
        System.out.println(l);
        System.out.println(l.pollLast());
        System.out.println(l);
        System.out.println(l.removeFirst());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.removeFirstOccurrence(10));
        System.out.println(l.removeLastOccurrence(71));
        System.out.println(l);
        l.set(4,88);
        System.out.println(l);
    }
}
