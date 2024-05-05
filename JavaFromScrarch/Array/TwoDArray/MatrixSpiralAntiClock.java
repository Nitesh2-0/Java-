package Array.TwoDArray;
import java.util.Scanner;
public class MatrixSpiralAntiClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of row :: ");
        int n = sc.nextInt();
        spiralAntiClockWise(n);
    }
    public static void spiralAntiClockWise(int n){
        int[][]matrix = new int[n][n];
        int tvl=0, str=1, topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1,Elem = 0;
        while(tvl < (n*n)){
//            leftCol => topRow to bottomRow, leftCol++;
            for (int j=topRow; j<=bottomRow && tvl++<(n*n); j++){
                matrix[j][leftCol] = str++;
            }
            leftCol++;
//            bottomRow => leftCol to rightCol, bottomRow--;
            for (int j=leftCol; j<=rightCol && tvl++<(n*n); j++){
                matrix[bottomRow][j] = str++;
            }
            bottomRow--;
//            rightCol => bottomRow to topRow, rightCol--;
            for (int j=bottomRow; j>=topRow && tvl++<(n*n); j--){
                matrix[j][rightCol] = str++;
            }
            rightCol--;
//            topRow => rightCol to leftCol, topRow++;
            for (int j=rightCol; j>=leftCol && tvl++<(n*n); j--){
                matrix[topRow][j] = str++;
            }
            topRow++;
        }
        display(matrix);
    }
    public static void display(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
