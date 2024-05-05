package BackTracking;
public class NQueen {
    public static void main(String[] args) {
        int  n = 5;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
    }

    private static void nQueen(char[][] board, int row) {
        if(row==board.length){
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[i].length; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0; i<board.length; i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                nQueen(board,row+1);
                board[row][i] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row,int cols) {
        int n = board.length;
        //check row
        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q') return false;
        }
        //check cols
        for(int i=0; i<board.length; i++){
            if(board[i][cols]=='Q') return false;
        }
        //check North east
        int i=row,j=cols;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--; j++;
        }
        i=row;
        j=cols;
        //check South East
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++; j++;
        }
        i=row;
        j=cols;
        //check South wast
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++; j--;
        }
        i=row;
        j=cols;
        //check North wast
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--; j--;
        }
        return true;
    }
}
