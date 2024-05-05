package HackerRank;
public class HackerRankInString {
    public static void main(String[] args) {
        String str = "hackerworld";
       String giv = "hackerrank";
       int i=0, j=0;
       if(str.length() < giv.length()) {
           System.out.println("NO");
           return;
       }
       while(i<str.length() && j<giv.length()){
           if(str.charAt(i)==giv.charAt(j)){
               i++; j++;
           }else{
               i++;
           }
       }
       if(j == giv.length()) {
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
    }
}
