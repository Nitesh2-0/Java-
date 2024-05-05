package Queue;
import java.util.*;

public class QueueUsingTwoStacks {
    public static class MyQueue{
        private Stack<Integer> stack = new Stack<>();
        private Stack<Integer> endMaintainer = new Stack<>();
        public void enqueue (int value){
            if(stack.isEmpty()){
                stack.push(value);
            }
            else{
                while(!stack.isEmpty()){
                    endMaintainer.push(stack.pop());
                }
                stack.push(value);
                while(!endMaintainer.isEmpty()){
                    stack.push(endMaintainer.pop());
                }
            }
        }
        public void dequeue(){
            stack.pop();
        }
        public int top(){
            return stack.peek();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();
        while(sc.hasNext()){
            int type = sc.nextInt();
            switch (type){
                case 1 :
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2 :
                    q.dequeue();
                    break;
                case 3 :
                    System.out.println(q.top());
                    break;
            }
        }
        sc.close();
    }
}
