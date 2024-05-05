package Stack;
import java.util.Stack;
public class Prefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println("Infix :: " + str);
        Stack<String> pre = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String newString = "" + ch;
                pre.push(newString);
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek() != '('){
                   String v2 = pre.pop();
                   String v1 = pre.pop();
                   char o = op.pop();
                   String t = o + v1 + v2;
                   pre.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = pre.pop();
                    String v1 = pre.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    pre.push(t);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = pre.pop();
                        String v1 = pre.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        pre.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(pre.size() > 1){
            String v2 = pre.pop();
            String v1 = pre.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            pre.push(t);
        }
        System.out.println("Prefix :: " + pre.peek());
    }
}
