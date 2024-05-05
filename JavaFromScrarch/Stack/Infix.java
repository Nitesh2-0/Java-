package Stack;
import java.util.Stack;
public class Infix {
    public static void main(String[] args) {
        Stack<Integer> valCont = new Stack<>();
        Stack<Character> opCont = new Stack<>();
        String str = "9-5+3*4/6";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            if(ascii >= 48 && ascii <= 57){
                valCont.push(ascii-48);
            }
            else if(opCont.isEmpty()){
                opCont.push(ch);
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
