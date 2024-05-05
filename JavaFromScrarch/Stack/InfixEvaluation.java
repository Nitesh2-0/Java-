package Stack;
import java.util.Stack;
public class InfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> valCont = new Stack<>();
        Stack<Character> opCont = new Stack<>();
        //Evaluate
        String str = "9+4+9*7*5/5";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                valCont.push(ascii-48);
            }
            else if(opCont.isEmpty() || ch=='(' || opCont.peek()=='('){
                opCont.push(ch);
            }
            else if(ch==')'){
                while(opCont.peek() != '('){
                    int currValue = valCont.pop();
                    int prevValue = valCont.pop();
                    if(opCont.peek()=='-'){valCont.push(prevValue-currValue);}
                    if(opCont.peek()=='+'){valCont.push(prevValue+currValue);}
                    if(opCont.peek()=='*'){valCont.push(prevValue*currValue);}
                    if(opCont.peek()=='/') {valCont.push(prevValue/currValue);}
                    opCont.pop();
                }
                opCont.pop();
            }
            else{
                if(ch=='-' || ch=='+'){
                    int currValue = valCont.pop();
                    int prevValue = valCont.pop();
                    if(opCont.peek()=='-'){valCont.push(prevValue-currValue);}
                    if(opCont.peek()=='+'){valCont.push(prevValue+currValue);}
                    if(opCont.peek()=='*'){valCont.push(prevValue*currValue);}
                    if(opCont.peek()=='/') {valCont.push(prevValue/currValue);}
                    opCont.pop();
                    opCont.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(opCont.peek()=='*' || opCont.peek()=='/'){
                        int currValue = valCont.pop();
                        int prevValue = valCont.pop();
                        if(opCont.peek()=='*'){valCont.push(prevValue*currValue);}
                        if(opCont.peek()=='/') {valCont.push(prevValue/currValue);}
                        opCont.pop();
                        opCont.push(ch);
                    }
                    else{
                        opCont.push(ch);
                    }
                }
            }
        }
        while(valCont.size()>1){
            int currValue = valCont.pop();
            int prevValue = valCont.pop();
            if(opCont.peek()=='-'){valCont.push(prevValue-currValue);}
            if(opCont.peek()=='+'){valCont.push(prevValue+currValue);}
            if(opCont.peek()=='*'){valCont.push(prevValue*currValue);}
            if(opCont.peek()=='/'){valCont.push(prevValue/currValue);}
            opCont.pop();
        }
        System.out.println("Ans :: " + valCont.peek());
    }
}
