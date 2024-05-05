package Stack.College;
public class ByArray {
    public static class Stack{
        int[] arr = new int[1200000];
        private int idx = -1;
        void push(int data) throws Exception{
            if(idx==arr.length-1) throw new Exception("Stack is Overflow.");
            arr[++idx] = data;
        }
        int pop() throws Exception{
            if(idx == -1) throw new Exception("Stack is Underflow.");
            return arr[idx--];
        }
        int peek() throws  Exception{
            if(idx == -1) throw new Exception("Stack is Underflow.");
            return arr[idx];
        }
        boolean isEmpty(){
            if(idx==-1) return true;
            return false;
        }
        int size(){
            if(idx == -1) return 0;
            return idx;
        }
    }
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
