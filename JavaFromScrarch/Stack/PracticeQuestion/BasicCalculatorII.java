package Stack.PracticeQuestion;
import java.util.Stack;
public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = "3+5/2";

        System.out.println("Ans :: " + calculate(s));
    }
    static public int calculate(String s) {
        Stack<Integer> value = new Stack<>();
        Stack<Character> operator = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int) s.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                int val = ascii-48;
                value.push(val);
            }
            else if(operator.isEmpty()){
                operator.push(ch);
            }
            else {
                if(ch=='+' || ch=='-'){
                    int val1 = value.pop();
                    int val2 = value.pop();
                    if(operator.peek()=='+'){value.push(val2+val1);}
                    if(operator.peek()=='-') {value.push(val2-val1);}
                    if(operator.peek()=='/'){value.push(val2/val1);}
                    if(operator.peek()=='*'){value.push(val2*val1);}
                    operator.pop();
                    operator.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if (operator.peek() == '/' || operator.peek() == '*') {
                        int val1 = value.pop();
                        int val2 = value.pop();
                        if (operator.peek() == '*') {
                            value.push(val2 * val1);
                        }
                        if(operator.peek() == '/') {
                            value.push(val2 / val1);
                        }
                        operator.pop();
                        operator.push(ch);
                    }
                    else {
                        operator.push(ch);
                    }
                }
            }
        }
        while(value.size() > 1){
            int val1 = value.pop();
            int val2 = value.pop();
            if(operator.peek()=='/'){value.push(val2/val1);}
            if(operator.peek()=='+'){value.push(val2+val1);}
            if(operator.peek()=='-'){value.push(val2-val1);}
            if(operator.peek()=='*') {value.push(val2*val1);}
            operator.pop();
        }
        return value.peek();
    }
}
