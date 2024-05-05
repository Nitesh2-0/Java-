package Stack;
import java.util.Stack;
public class PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        int n = str.length();
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else {
                int val2 = val.pop();
                int val1 = val.pop();
                if (ch == '*') {
                    val.push(val1 * val2);
                }
                if (ch == '-') {
                    val.push(val1 - val2);
                }
                if (ch == '/') {
                    val.push(val1 / val2);
                }
                if (ch == '+') {
                    val.push(val1 + val2);
                }
            }
        }
        int PostfixEvaluation = val.pop();
        System.out.println("Ans :: " + PostfixEvaluation);
    }
}
