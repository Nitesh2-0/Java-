package Stack.PracticeQuestion;
import java.util.Stack;
public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "{{[[())]]}}";
        System.out.println("Ans :: " + isBalanced(str));
    }
    public static String isBalanced(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if((ch==')'&&stack.peek()=='(') || (ch==']'&&stack.peek()=='[') || (ch=='}'&&stack.peek()=='{')){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }
}
