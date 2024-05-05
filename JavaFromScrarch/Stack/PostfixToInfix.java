package Stack;
import java.util.Stack;
public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        int n = s.length();
        Stack<String> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String conv = "" + (ascii-48);
                stack.push(conv);
            } else {
                String val2 = stack.pop();
                String val1 = stack.pop();
                String concat = '(' + val1 + ch + val2 + ')';
                stack.push(concat);
            }
        }
        System.out.println("Ans :: " + stack.peek());
    }
}
