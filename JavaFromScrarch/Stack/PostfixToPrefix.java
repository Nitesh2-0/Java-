package Stack;
import java.util.Stack;
public class PostfixToPrefix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> stack = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57) {
                String cult = "" + (ascii - 48);
                stack.push(cult);
            } else {
                String val2 = stack.pop();
                String val1 = stack.pop();
                String val = ch + val1 + val2;
                stack.push(val);
            }
        }
        String str = stack.pop();
        System.out.println("Ans :: " + str);
    }
}
