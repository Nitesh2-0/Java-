package HackerRank;
import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static void main(String[] args) {
        String str = "We promptly judged antique ivory buckles for the next prize";
        str = str.toLowerCase();
        Set<Character> st = new HashSet<>();
        for(Character d : str.toCharArray()){
            st.add(d);
        }
        System.out.println(st);
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(Character c : s.toCharArray()){
            if(!st.contains(c)){
                System.out.println("Not Present");
                System.out.println(c);
                return;
            }
        }
        System.out.println("Present all alphabets!");
    }
}
