package DString;
import java.util.Scanner;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        toggle(sb);
    }
    public static void toggle(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            boolean fag = true;
            char ch = sb.charAt(i);
            if(ch == ' ') continue;
            int assi = (int)ch;
            if(assi >= 97) fag = false;
            if(fag == true){
                assi += 32;
                char at = (char)(assi);
                sb.setCharAt(i,at);
            }
            else{
                assi -= 32;
                char at = (char)(assi);
                sb.setCharAt(i,at);
            }
        }
        System.out.println(sb);
    }
}
