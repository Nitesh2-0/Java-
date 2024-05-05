package Array.TwoDArray;
import java.util.Scanner;
public class MatrixSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and colum :: ");
        int row = sc.nextInt(), colum= sc.nextInt();
        int[][] arr = new int[row][colum];
        System.out.println("Enter " + row*colum + " Element");
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        spiralMatrix(arr,row,colum);
    }
    public static void spiralMatrix(int[][] arr, int row, int colum){
        int topRow = 0,bottomRow = row-1,leftCol = 0,rightCol = colum-1;
        int totalElem = row*colum,trv=0;
        while(trv<totalElem){
            // TopRow => leftCol to rightCol,TopRow++;
            for (int i=leftCol; i<=rightCol && trv++ < totalElem; i++){
                System.out.print(arr[topRow][i] + " ");
            }
            topRow++;
            // RightCol => topRow to bottomRow, RightCol--;
            for (int i=topRow; i<=bottomRow && trv++ < totalElem; i++){
                System.out.print(arr[i][rightCol] + " ");
            }
            rightCol--;
            // BottomRow => rightCol to leftCol, BottomRow--;
            for (int i=rightCol; i>=leftCol && trv++ < totalElem; i--){
                System.out.print(arr[bottomRow][i] + " ");
            }
            bottomRow--;
            // LeftCol => bottomRow to topRow, leftCol++;
            for (int i=bottomRow; i>=topRow && trv++ < totalElem; i--){
                System.out.print(arr[i][leftCol] + " ");
            }
            leftCol++;
        }
    }
}
