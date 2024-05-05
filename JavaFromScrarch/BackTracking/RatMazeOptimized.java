package BackTracking;
public class RatMazeOptimized {
    public static void main(String[] args) {
        int row = 3;
        int cols = 4;
        int[][] maze = {{1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1}};
        printPath(0, 0, row - 1, cols - 1, maze, "");
    }

    static void printPath(int sr, int sc, int er, int ec, int[][] maze, String s) {
        if (sr < 0 || sc < 0) return;
        if (sr > er || sc > ec) return;
        if (maze[sr][sc] == 0) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
        }
        if (maze[sr][sc]==-1) return;
        maze[sr][sc] = -1;
        //for right
        printPath(sr, sc + 1, er, ec, maze, s + "R");
        //down
        printPath(sr + 1, sc, er, ec, maze, s + "D");
        //up
        printPath(sr, sc - 1, er, ec, maze, s + "U");
        //Left
        printPath(sr - 1, sc, er, ec, maze, s + "L");

        maze[sr][sc] = 1;
    }
}
