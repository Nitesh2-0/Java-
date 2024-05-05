package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        Stack<Integer> st = new Stack<>();
        while (q.size()>0){
            int val = q.remove();
            st.push(val);
        }
        System.out.println(st);
        while(st.size() > 0){
            int val = st.pop();
            q.add(val);
        }
        System.out.println(q);
    }
}
