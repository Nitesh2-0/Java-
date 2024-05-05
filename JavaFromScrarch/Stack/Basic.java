package Stack;
import java.util.Stack;
public class Basic {
        public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(10);
            s.push(18);
            System.out.println(s);
            System.out.println(s.peek());
            s.pop();
            System.out.println(s);
            System.out.println("Size is : " + s.size());
        }

}
