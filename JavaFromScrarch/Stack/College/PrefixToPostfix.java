package Stack.College;
import java.util.Stack;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        Stack<String> stack = new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(""+ch);
            }
            else if(ch!='*' && ch!='-' && ch!='/' && ch !='+'){
                String coulter = ""+ch;
                stack.push(coulter);
            }else{
                String e1 = stack.pop();
                String e2 = stack.pop();
                String newStr = e1 + e2 + ch;
                stack.push(newStr);
            }
        }
        String result = stack.pop();
        System.out.println(result);
    }
}
