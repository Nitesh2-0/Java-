package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueOptimize {
   static class  MyStack {
        Queue<Integer> q = new LinkedList<>();
        public void push(int x) {
            if(q.size()==0){
                q.add(x);
            } else {
                q.add(x);
                for(int i=1; i<=q.size()-1; i++){
                    q.add(q.remove());
                }
            }
        }
        public int pop() {
            return q.remove();
        }
        public int top() {
            return q.peek();
        }
        public boolean empty() {
            if(q.size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
       MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);

//        s.display();
        System.out.println(s.top());
    }
}
