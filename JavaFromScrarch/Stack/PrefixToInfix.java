package Stack;
import java.util.Stack;
public class PrefixToInfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        int n = s.length();
        Stack<String> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String cult = "" + (ascii-48);
                stack.push(cult);
            } else {
                String val1 = stack.pop();
                String val2 = stack.pop();
                String ans = "(" + val1 + ch + val2 + ")";
                stack.push(ans);
            }
        }
        String st = stack.pop();
        System.out.println("Ans :: " + st);
    }
}
