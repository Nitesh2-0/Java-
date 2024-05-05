package LinkedList;
import java.util.HashSet;
import java.util.LinkedList;

public class CountPairsWhoseSum {
    public static void main(String[] args) {
        LinkedList<Integer> head1 = new LinkedList<>();
        head1.add(5);
        head1.add(8);
        head1.add(7);
        head1.add(9);

        LinkedList<Integer> head2 = new LinkedList<>();
        head2.add(9);
        head2.add(7);
        head2.add(5);

        int tar = 14;
        HashSet<Integer> set = new HashSet<>();
        for(int elm : head1){
            set.add(elm);
        }

        int count = 0;
        for(int el : head2){
            if(set.contains(tar-el)) count++;
        }

        System.out.println(count);
    }
}
