package LeetCode;
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int  n = 15;
       int ans =(int) Math.floor(Math.sqrt(n));
        System.out.println("Ans :: " + check(ans,n));
    }
    static boolean check(int ans , int n){
        return ans*ans == n ? true: false;
    }
}
