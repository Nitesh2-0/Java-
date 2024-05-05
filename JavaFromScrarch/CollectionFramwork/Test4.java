package CollectionFramwork;
import java.util.ArrayList;
import java.util.Collections;
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(50);
        li1.add(100);
        li1.add(500);
        li1.add(400);
        System.out.println("List :: " + li1);
        ArrayList<Integer> li2 = new ArrayList<>();
        li2.add(200);
        li2.add(30);
        li2.add(40);
        li2.add(80);
        System.out.println("List :: " + li1);
        li2.addAll(li1);
        System.out.println(li1);
        Collections.sort(li2);
        System.out.println(li2);
        System.out.println(li2.contains(30));
        System.out.println(li2.remove(4));
        System.out.println(li2.removeIf(n->n <= 100));
        System.out.println(li2);
        Collections.swap(li2,0,2);
        System.out.println(li2);
        Collections.reverse(li2);
        System.out.println(li2);

        //Swap two number
        li2.set(1,99);

        int n = li2.size(), i=0, j=n-1;
        while(i <= j){
            Integer temp = li2.get(i);
            li2.set(i,li2.get(j));
            li2.set(j,temp);
            i++; j--;
        }
        System.out.println(li2);
        li2.set(2,99);
        System.out.println(li2);
        System.out.println(li2.isEmpty());
//        li2.clear();
//        System.out.println(li2.isEmpty());
        System.out.println(li1);
        System.out.println(li1.retainAll(li2));
        System.out.println(li2);
    }
}
