package GeeksForGeeks.Top50StringProblem;
public class StringOfBrackets {
    public static void main(String[] args) {
        String str = "(())))(";
        long count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==')') count++;
        }
        System.out.println(count);
        System.out.println(EqualPoint(str));
    }
    public static long EqualPoint(String str){
        long count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')') count++;
        }
        long cnt = 0;
        for(int j=0; j<str.length(); j++){
            char ch = str.charAt(j);
            if(ch=='('){
                cnt++;
            }else{
                count--;
                if(cnt==count) return j+1;
            }
        }
        return -1;
    }
}
