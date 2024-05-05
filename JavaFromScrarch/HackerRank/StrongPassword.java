package HackerRank;
import java.util.HashSet;

public class StrongPassword {
    public static void main(String[] args) {
        String str ="Ab1";
        System.out.println(minimumNumber(str.length(),str));
    }
    public static int minimumNumber(int n, String password) {
        HashSet<Integer> it = new HashSet<>();
        for(int i=0; i<password.length(); i++) {
            int val = (int) password.charAt(i);
            if (val >= 48 && val <= 57) {
                it.add(1);
            } else if (val >= 65 && val <= 90) {
                it.add(2);
            } else if (val >= 97 && val <= 122) {
                it.add(3);
            } else {
                it.add(4);
            }
        }
        int curr = 4-it.size()+n;
        if(curr < 6){
            return 6-n;
        }
        return 4-it.size();
    }
}
