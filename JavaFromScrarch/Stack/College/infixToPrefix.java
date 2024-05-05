package Stack.College;
import java.util.Stack;
public class infixToPrefix {
    public static int precedence(char option){
        switch (option){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        String str = "(a+b)/(c+d^e)";
        String s = new String("");
        
    }
}
