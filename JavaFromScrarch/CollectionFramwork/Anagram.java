package CollectionFramwork;
import java.util.HashMap;
public class Anagram {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            } else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
    // 1st approach
    static boolean isAnagram1(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = makeFreqMap(s);
        HashMap<Character,Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }
    //2nd approach
    static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp = makeFreqMap(s);
        for(int i=0; i<t.length(); i++){
            Character ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            mp.put(ch,currFreq-1);

        }
        for(Integer i : mp.values()){
            if(i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String st = "anagram";
        String st1 = "nagaram";
        System.out.println("Ans :: " + isAnagram(st,st1));
        System.out.println("Ans :: " + isAnagram1(st,st1));
    }
}
