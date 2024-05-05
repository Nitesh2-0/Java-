package GeeksForGeeks;

public class FindTheNthcharacter {
    public static void main(String[] args) {
        String s = "1100";
        int r = 2;
        int n = 3;
        StringBuilder sb = new StringBuilder("");
        int idx = 0;
        while(idx < r){
            sb = new StringBuilder("");
            for(char c : s.toCharArray()){
                if(c == '1'){
                    sb.append("10");
                }else{
                    sb.append("01");
                }
            }
            s = sb.toString();
            idx++;
        }
        String str = sb.toString();
        System.out.println(s);
        System.out.println(s.charAt(n));
    }
}
