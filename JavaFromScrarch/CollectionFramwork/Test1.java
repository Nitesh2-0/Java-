package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Nitesh");
        a.add("Arup");
        a.add("Nitesh");
        a.add("Hii");
        int n = a.size(), i=n-1,j=0;
        while(j <= i){
//            String temp = a.get(i);
//            a.set(i,a.get(j));
//            a.set(j,temp);
            Collections.swap(a,i,j);
            i--; j++;
        }
        for(String s : a){
            System.out.print(s + " ");
        }
        System.out.println();
        odd(a);
    }
    public static void odd(ArrayList<String> s){
        int n = s.size();
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(s.get(i) + " ");
            }
        }
    }
}
