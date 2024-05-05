package Queue;
import java.util.*;
public class ReverseKElement {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println("K :: 3");
        System.out.print("Simple Queue :: ");
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while(q.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        while(k-1 > 0){
            st.push(q.remove());
            k--;
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        System.out.print("Reversed Queue :: ");
        System.out.println(q);
    }
}
