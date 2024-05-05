package HackerRank;
import java.util.ArrayList;
import java.util.List;
public class ReverseList {
    public static void main(String[] args) {
        List<Integer> sc = new ArrayList<>();
        sc.add(0);
        sc.add(1);
        sc.add(2);
        sc.add(3);
        System.out.println(sc);
        List<Integer> c = reverseArray(sc);
        System.out.println(c);
    }
    public static List<Integer> reverseArray(List<Integer> a) {
        int n = a.size(),str=0,end=n-1;
        while(str <= end){
            int temp = a.get(str);
            a.set(str, a.get(end));
            a.set(end,temp);
            str++; end--;
        }
        return a;
    }
}
