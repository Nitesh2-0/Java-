package Array.TwoDArray;
import java.util.Scanner;
public class MatrixSpiralGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        spiralMatrix(n);
    }
    public static void spiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int runningElem = 1 , trv = 0,topRow = 0,bottomRow = n-1,leftCol=0,rightCol=n-1;
        while(trv < n*n){
//            TopRow => leftCol to rightCol,topRow++;
            for (int i=leftCol; i<= rightCol && trv++ < (n*n); i++){
                 matrix [topRow][i] = runningElem++;
            }
            topRow++;
//            RightColum => topRow to bottomRow, rightCol--;
            for (int i=topRow; i<= bottomRow && trv++ < (n*n); i++){
                matrix [i][rightCol] = runningElem++;
            }
            rightCol--;
//            BottomRow => rightCol to leftCol, bottomRow--;
            for (int i=rightCol; i>= leftCol && trv++ < (n*n); i--){
                matrix [bottomRow][i] = runningElem++;
            }
            bottomRow--;
//            LeftColum => bottomRow to topRow, leftCol++;
            for (int i=bottomRow; i>= topRow && trv++ < (n*n); i--){
                matrix [i][leftCol] = runningElem++;
            }
            leftCol++;
        }
        display(matrix);
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
