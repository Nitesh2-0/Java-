package Queue;
import java.util.Stack;
public class QueueUsingStack {
    static class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        public MyQueue() {
            st = new Stack<>();
            helper = new Stack<>();
        }

        public void push(int x) {
            st.push(x);
        }

        public int pop() {
            while(st.size() > 1){
                helper.push(st.pop());
            }
            int rem = st.pop();
            while(helper.size() > 0){
                st.push(helper.pop());
            }
            return rem;
        }

        public int peek() {
            while(st.size() > 1){
                helper.push(st.pop());
            }
            int rem = st.peek();
            while(helper.size() > 0){
                st.push(helper.pop());
            }
            return rem;
        }

        public boolean empty() {
            if(st.size()==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        MyQueue m = new MyQueue();
        m.push(11);
        m.push(12);
        m.push(13);
        System.out.println(m.peek());
        m.pop();
        System.out.println(m.empty());
//        m.display();
        m.push(77);
        m.push(88);
        System.out.println(m.peek());
        System.out.println(m.st);
    }
}
