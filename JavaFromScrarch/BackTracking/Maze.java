package BackTracking;
import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row :: ");
        int row = sc.nextInt();
        System.out.print("Enter number of Column :: ");
        int col = sc.nextInt();
        int totalNumberOFWays = maze(1,1,row,col);
        System.out.print("Ans = " + totalNumberOFWays);
    }
    public static int maze(int stR, int stC, int endRow, int endCol) {
        if(stR > endRow || stC > endCol) return 0;
        if(stR == endRow && stC == endCol) return 1;
        int downWays = maze(stR+1,stC,endRow,endCol);
        int rightWays = maze(stR,stC+1,endRow,endCol);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}
