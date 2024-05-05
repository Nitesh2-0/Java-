package Stack.PracticeQuestion;
import java.util.Stack;
public class RemoveAdjacentDuplicatesString {
    public static void main(String[] args) {
        String s = "aab";
//        System.out.println("Ans :: " + removeDuplicates(s));
        System.out.println("Ans :: " + removeDuplicates1(s));

    }
    public static String removeDuplicates(String s) {
        // my approach TC-O(n) and SC-O(n)
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(stack.peek() != ch){
                stack.push(ch);
            }
            else {
                stack.pop();
            }
        }
        String st = "";
        while (!stack.isEmpty()){
            st += stack.pop();
        }
        StringBuilder sb = new StringBuilder(st);
        return sb.reverse().toString();
    }
    public static String removeDuplicates1(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if((stack.size()>0) && (stack.peek()==s.charAt(i))){
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char sd : stack){
            sb.append(sd);
        }
        return sb.toString();
    }
}
