package Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int n = queue.size();

        Queue<Integer> st = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            int a = queue.remove();
            st.add(a);
            System.out.print(a + " ");
        }
        System.out.println();
        while(!st.isEmpty()){
            queue.add(st.poll());
        }
        System.out.println(queue);
    }
}
