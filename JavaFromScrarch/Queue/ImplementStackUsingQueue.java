package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class ImplementStackUsingQueue {
    static class MyStack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int val){
            q1.add(val);
        }

        public int pop(){
            while (q1.size() > 1){
                q2.add(q1.remove());
            }
            int last = q1.remove();
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            return last;
        }

        public int peek(){
            while (q1.size() > 1){
                q2.add(q1.remove());
            }
            int last = q1.remove();
            q2.add(last);
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            return last;
        }

        public boolean isEmpty(){
            int n = q1.size();
            if(n == 0)
                return true;
            return false;
        }

        public void display(){
            int f = 1;
            System.out.print("[");
            while (q1.size() > 1){
                int data = q1.remove();
//                q2.add(data);
                System.out.print(data + ", ");
            }
            int last = q1.remove();
            System.out.println(last + "]");
            q2.add(last);
            while(q2.size() > 0){
                q1.add(q2.remove());
            }
        }
    }
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.q1);
        System.out.println(st.peek());
    }
}
