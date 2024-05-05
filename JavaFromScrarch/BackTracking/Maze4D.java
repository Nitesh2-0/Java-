package BackTracking;
import java.util.Scanner;
public class Maze4D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row :: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column :: ");
        int column = sc.nextInt();

        boolean[][] isVisited = new boolean[row][column];
        printAllPath(0,0,row-1,column-1,isVisited,"");
    }
    private static void printAllPath(int sr, int sc, int er, int ec, boolean[][] isVisited, String s) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //for right
        printAllPath(sr,sc+1,er,ec,isVisited,s+"R");
        //for down
        printAllPath(sr+1,sc,er,ec,isVisited,s+"D");
        //for left
        printAllPath(sr-1,sc,er,ec,isVisited,s+"L");
        //for up
        printAllPath(sr,sc-1,er,ec,isVisited,s+"U");

        isVisited[sr][sc] = false;
    }
}
