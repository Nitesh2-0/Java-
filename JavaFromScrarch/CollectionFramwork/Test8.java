package CollectionFramwork;
import java.util.LinkedList;
public class Test8 {
    public static void main(String[] args) {
        LinkedList<Character> l = new LinkedList<>();
        l.add('A');
        l.add('B');
        l.add(2,'E');
        l.addFirst('D');
        l.addLast('C');
        System.out.println(l);
        l.remove(1);
        l.remove(3);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
