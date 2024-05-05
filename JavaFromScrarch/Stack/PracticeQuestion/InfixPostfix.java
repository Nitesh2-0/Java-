package Stack.PracticeQuestion;
import java.util.Stack;
public class InfixPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        int n = s.length();
        Stack<String> val = new Stack<>();
        Stack<Character> o = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                String str = "" + (ascii-48);
                val.push(str);
            }
            else if(o.isEmpty() || o.peek()=='(' || ch=='(') {
                o.push(ch);
            }
            else if(ch==')'){
                while(o.peek() != '('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char ope = o.pop();
                    String post = val1 + val2 + ope;
                    val.push(post);
                }
                o.pop();
            }
            else {
                if(ch=='^' && o.peek() != '('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char ope = o.pop();
                    String post = val1 + val2 + ope;
                    val.push(post);
                } else if (ch == '^' && o.peek() == '(') {
                    o.push(ch);
                }
                else if((ch=='-' || ch=='+') && o.peek()!='(' && (o.peek()=='-' || o.peek()=='+')){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char ope = o.pop();
                    String post = val1 + val2 + ope;
                    val.push(post);
                }
                else if((ch=='-' || ch=='+') && o.peek()!='(' && (o.peek()!='-' && o.peek()!='+')){
                    o.push(ch);
                }
                else {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char ope = o.pop();
                    String post = val1 + val2 + ope;
                    val.push(post);
                }
            }
        }
        while(o.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char ope = o.pop();
            String post = val1 + val2 + ope;
            val.push(post);
        }
        System.out.println("Ans :: " + val.peek());
    }
}
