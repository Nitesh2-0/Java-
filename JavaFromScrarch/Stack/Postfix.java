package Stack;
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix :: " + infix);
        Stack<String> postfix = new Stack<>();
        Stack<Character> op = new Stack<>();
        int n = infix.length();
        for(int i=0; i<n; i++){
            char ch = infix.charAt(i);
            int ascii = (int) infix.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String newString  = "" + ch;
                postfix.push(newString);
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek() != '('){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char o = op.pop();
                    String con = v1 + v2 + o;
                    postfix.push(con);
                }
                op.pop();
            }
            else {
                if(ch=='+' || ch=='-'){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char o = op.pop();
                    String con = v1 + v2 + o;
                    postfix.push(con);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='/' || op.peek()=='*'){
                        String v2 = postfix.pop();
                        String v1 = postfix.pop();
                        char o = op.pop();
                        String con = v1 + v2 + o;
                        postfix.push(con);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(postfix.size() > 1){
            String v2 = postfix.pop();
            String v1 = postfix.pop();
            char o = op.pop();
            String con = v1 + v2 + o;
            postfix.push(con);
        }
        String post = postfix.pop();
        System.out.println("Postfix :: " + post);
    }
}
