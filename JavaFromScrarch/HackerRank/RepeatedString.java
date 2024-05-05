package HackerRank;
public class RepeatedString {
    public static void main(String[] args) {
        String str = "aba";
        StringBuilder sb = new StringBuilder("");
        int num = 10;
        int ptr1 = 0 , ptr2 = 0;
        while (ptr1 < num && ptr2 < str.length()){
            char val = str.charAt(ptr2);
            if(ptr2 == str.length()-1){
                sb.append(val);
                ptr1 = ptr1+str.length();
                ptr2 = 0;
            }else {
                sb.append(val);
                ptr2++;
            }
        }
        System.out.println(sb);
    }
}
