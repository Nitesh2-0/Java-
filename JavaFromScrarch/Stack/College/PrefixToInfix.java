package Stack.College;
import java.util.Stack;
public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        Stack<String> infix = new Stack<>();
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            if (str.isEmpty()) {
                String newData = "" + ch;
                infix.push(newData);
            } else if (ch != '*' && ch != '-' && ch != '/' && ch != '+') {
                String coulter = "" + ch;
                infix.push(coulter);
            }else{
                String data1 = infix.pop();
                String data2 = infix.pop();
                String acc = data1 + ch + data2;
                infix.push(acc);
            }
        }
        System.out.println(infix.pop());
    }
}
