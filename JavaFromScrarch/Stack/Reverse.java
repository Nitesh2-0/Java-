package Stack;
import java.util.Stack;
public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);

        System.out.println("Before :: " + st);
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println("After  :: " + rt);

        Stack<Integer> pt = new Stack<>();
        while(rt.size() > 0){
            pt.push(rt.pop());
        }
        System.out.println("After  :: " + pt);
    }
}
