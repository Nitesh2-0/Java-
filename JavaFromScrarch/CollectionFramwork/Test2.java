package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Java is Best");
        arr.add(14);
        arr.add(18000L);
        arr.add(6.0D);
        arr.add(1.99f);
        System.out.println("ArrayList after all the insertion !");
        display(arr);
        arr.set(0,50);
        arr.set(1,10.50D);
        display(arr);
        Collections.reverse(arr);
        display(arr);
    }
    static void display(ArrayList<Object> arr){
        for(Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
