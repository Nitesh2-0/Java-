package HackerRank;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class CompareTriplets {
    public static void main(String[] args) {
        List<Integer> alice = Arrays.asList(17,28,30);
        List<Integer> bobs = Arrays.asList(99,16,8);
        System.out.println(alice);
        System.out.println(bobs);
        List<Integer> result = compareTriplets(alice,bobs);
        System.out.println(result);
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int Alice = 0 , Bob = 0;
        int i=0,n1 = a.size();

        for(i=0; i<n1; i++){
            if(a.get(i) == b.get(i))
                continue;
            if(a.get(i) > b.get(i))
                Alice++;
            else
                Bob++;
        }
        result.add(Alice);
        result.add(Bob);
        return result;
    }
}
