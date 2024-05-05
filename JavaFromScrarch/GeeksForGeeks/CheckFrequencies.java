package GeeksForGeeks;
import java.util.HashMap;

public class CheckFrequencies {
    public static void main(String[] args) {
        String str = "xxxxyyzz";

        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : str.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c , 1);
            }else {
                map.put(c , map.get(c)+1);
            }
        }
        int val = map.get(str.charAt(0));
        for(Character c : map.keySet()){
            if(val == map.get(c)){
                continue;
            }else{
                System.out.println("Not possible");
                break;
            }
        }

        System.out.println(map);

    }
}
