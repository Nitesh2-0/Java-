package Stack;
import java.util.*;
public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                if(ch==']'&&stack.peek()=='[' || ch=='}'&&stack.peek()=='{' || ch==')'&&stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
    }
}
