package Stack;
import java.util.Stack;
public class Copy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(9);
        st.push(1);
        st.push(0);
        st.push(5);
        System.out.println("1st Stack :: " + st);

        Stack<Integer> rt = new Stack<>();
        while((st.size()) > 0){
            rt.push(st.pop());
        }

        Stack<Integer> at = new Stack<>();
        while(rt.size() > 0){
            at.push(rt.pop());
        }
        System.out.println("2nd Stack :: " + at);
    }
}
