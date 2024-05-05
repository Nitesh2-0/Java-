package Stack;
import java.util.Stack;
public class RecReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);

        System.out.println("Stack1 :: " + st);
        reverse(st);
        System.out.println("Stack2 :: " + st);
    }
    static void reverse(Stack<Integer> st){
        if(st.size()==1) return ;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    static void pushAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
}
