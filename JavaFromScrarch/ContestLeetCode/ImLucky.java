package ContestLeetCode;
import java.util.*;
public class ImLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int N = sc.nextInt(),B= sc.nextInt(),K= sc.nextInt();
            int G = N-B;
            int boyTeam = B/K;
            int boyRemaining = B%K;
            int girlTeam = G/K;
            int girlRemaining = G%K;
            if(girlTeam==0){
                System.out.println(boyRemaining);
            }else if(boyTeam==0){
                System.out.println(girlRemaining);
            }else if(girlRemaining==0&&boyRemaining==0){
                System.out.println(0);
            }else{
                System.out.println(boyRemaining%girlRemaining);
            }
        }
    }
}
