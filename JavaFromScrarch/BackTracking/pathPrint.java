package BackTracking;
import java.util.Scanner;

public class pathPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row :: ");
        int row = sc.nextInt();
        System.out.print("Enter number of Column :: ");
        int col = sc.nextInt();
        maze(1,1,row,col,"");
    }
    private static void maze(int sr, int sc, int er, int ec,String s) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return ;
        }
        //Right
        maze(sr,sc+1,er,ec,s+"R");
        //Down
        maze(sr+1,sc,er,ec,s+"D");
    }
}
