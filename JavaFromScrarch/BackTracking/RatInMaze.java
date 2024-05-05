package BackTracking;
public class RatInMaze {
    public static void main(String[] args) {
        int row = 3;
        int cols = 4;
        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
        boolean[][] isVisited = new boolean[3][4];
        printPath(0,0,row-1,cols-1,maze,"",isVisited);
    }

    static void printPath(int sr, int sc, int er, int ec, int[][] maze, String s, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc]==0) return;
        if(sr==er && sc==ec){
            System.out.println(s);
        }
        if(isVisited[sr][sc]) return;
        isVisited[sr][sc] = true;
        //for right
        printPath(sr,sc+1,er,ec,maze,s+"R",isVisited);
        //down
        printPath(sr+1,sc,er,ec,maze,s+"D",isVisited);
        //up
        printPath(sr,sc-1,er,ec,maze,s+"U",isVisited);
        //Left
        printPath(sr-1,sc,er,ec,maze,s+"L",isVisited);

        isVisited[sr][sc] = false;
    }
}
