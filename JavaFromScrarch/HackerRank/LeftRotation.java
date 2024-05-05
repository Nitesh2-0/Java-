package HackerRank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner render = new Scanner(System.in);
        List<Integer> sc = new ArrayList<>();
        sc.add(1);
        sc.add(2);
        sc.add(3);
        sc.add(4);
        sc.add(5);
        System.out.println(sc);
        System.out.print("Enter the D :::");
        int d = render.nextInt();
        List<Integer> c = leftRotation(sc,d);
        System.out.println(c);
    }
    static List<Integer> leftRotation(List<Integer> a,int d){
        int n = a.size();
        swap(a,0,d-1);
        swap(a,d,n-1);
        Collections.reverse(a);
        return a;
    }
    static void swap(List<Integer> a,int str,int end){
        while (str <= end){
            int temp = a.get(str);
            a.set(str,a.get(end));
            a.set(end,temp);
            str++; end--;
        }
    }
}
