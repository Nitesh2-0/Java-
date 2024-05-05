package Stack.College;
import java.util.Stack;

public class infixToPostfix {
    public static int precedence(char c){
        char option = c;
        switch (option){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        String str = "(a+b)/(c+d^e)";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }else if(ch == '('){
                stack.add(ch);
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        System.out.println(stack);
    }
}
