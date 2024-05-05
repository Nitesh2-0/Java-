package CollectionFramwork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Traversing list through list Iterator");
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.print(str + " ");
        }
        System.out.println();
        for(int i=0; i<=list.size()-1; i++){
            System.out.print(list.get(i) + " ");
        }
        ArrayList<String> l = new ArrayList<>();
        l.add("vijay");
        l.add("Ravi");
        l.add("Ajay");
        l.add("Ajay");
        System.out.println();
        list.forEach(a ->{
            System.out.print(a + " ");
        });
        System.out.println();
        l.forEach(b ->{
            System.out.print(b + " ");
        });
        System.out.println();
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> {
            System.out.print(a + " ");
        });
        System.out.println();
        print(list);
    }
    static void print(ArrayList<String> a){
        System.out.println(a.removeIf(n -> n.charAt(0)=='A'));
        System.out.println(a);
        // 23 45 32 63 find number which are divisible by 3 remove
        ArrayList<Integer> number = new ArrayList<>();
        number.add(32);
        number.add(23);
        number.add(45);
        number.add(63);
        System.out.println(number.removeIf(n -> n%3==0));
        System.out.println(number);
    }
}
