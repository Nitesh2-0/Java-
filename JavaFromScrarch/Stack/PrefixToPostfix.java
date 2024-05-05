package Stack;
import java.util.Stack;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        int n = str.length();
        Stack<String> post = new Stack<>();
        for(int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String cult = ""+ (ascii-48);
                post.push(cult);
            } else {
                String val1 = post.pop();
                String val2 = post.pop();
                String t = val1 + val2 + ch;
                post.push(t);
            }
        }
        System.out.println("Ans :: " + post.peek());
    }
}
