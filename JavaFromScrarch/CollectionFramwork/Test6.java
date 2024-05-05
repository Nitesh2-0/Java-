package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<String> li1 = new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);

        li1.add("Nitesh");
        li1.add("Kumar");
        li1.add("Rupesh");
        li1.add("Mahesh");
        li1.add("Ramesh");

        for(Integer i : li){
            System.out.print(i + " ");
        }
        System.out.println();
        for(String s : li1){
            System.out.print(s + " ");
        }
        System.out.println();
        li1.remove("Kumar");
        System.out.println(li1.get(1));
        System.out.println(li.removeIf(n -> n < 10));
        System.out.println(li);
        System.out.println(li.isEmpty());
        System.out.println(li.clone());
        System.out.println(li1);
        Collections.reverse(li1);
        System.out.println(li1);
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
        Collections.swap(li1,1,2);
        System.out.println(li1);
//        li.set(0,66);
        System.out.println(li);
//        System.out.println(li.get(0)); // Error Because of, we try to access element from li list but still list is empty
        li.add(88);
        li.add(99);
        li.add(55);
        li.add(66);
        System.out.println(li);
        li.set(0,99);
        System.out.println(li);
        System.out.println(li.get(0));
    }
}
