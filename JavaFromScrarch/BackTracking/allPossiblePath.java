package BackTracking;
import java.util.ArrayList;
import java.util.List;

public class allPossiblePath {
    public static void main(String[] args) {
        int row = 2, cols = 3;
        int[][] board = {{1,2,3},
                         {4,5,6}};
        List<List<Integer>> result = new ArrayList<>();
        findPath(0,0,row-1,cols-1,new ArrayList<>(),result,board);
        System.out.println(result);
    }
    private static void findPath(int sR, int sC, int eR, int eC, ArrayList<Integer> currentPath, List<List<Integer>> result, int[][] grid) {
        // Base case: If the current position is the destination
        if (sR == eR && sC == eC) {
            currentPath.add(grid[sR][sC]);
            result.add(new ArrayList<>(currentPath));
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        currentPath.add(grid[sR][sC]);
        //down
        if(sR+1<=eR){
            findPath(sR+1,sC,eR,eC,currentPath,result,grid);
        }
        //right
        if(sC+1<=eC){
            findPath(sR,sC+1,eR,eC,currentPath,result,grid);
        }
        currentPath.remove(currentPath.size()-1);
    }
}
