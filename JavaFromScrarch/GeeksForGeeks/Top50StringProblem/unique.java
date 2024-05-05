package GeeksForGeeks.Top50StringProblem;
import java.util.*;

public class unique {
    public static void main(String[] args) {
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder("");
        String str = "geekForGeeks";
        for(char c : str.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
