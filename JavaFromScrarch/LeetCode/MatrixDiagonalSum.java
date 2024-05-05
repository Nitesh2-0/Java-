package LeetCode;
import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and colum :: ");
        int row = sc.nextInt(),colum= sc.nextInt();
        int[][] arr = new int[row][colum];
        System.out.println("Enter " + row*colum + " Element.");
        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        MatrixDiagonalSum mds = new MatrixDiagonalSum();
        int currentValue = mds.diagonalSum(arr);
        System.out.println("Ans of Diagonal Sum :: " + currentValue);
    }
    public int diagonalSum(int[][] mat) {
        int sum1 = sum(mat);
        //Perform Swap row wise
        for(int i=0; i<mat.length/2; i++){
            for(int j=0; j<mat[i].length; j++){
               int temp = mat[i][j];
               mat[i][j] = mat[mat.length-1-i][j];
               mat[mat.length-1-i][j] = temp;
            }
        }
        int sum2 = sum(mat);
        if(mat.length%2 != 0){
            int interMediate = mat[mat.length/2][mat[0].length/2];
            return (sum1+sum2)-interMediate;
        }
        return (sum1+sum2);
    }
    static int sum(int[][] mat){
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i==j){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
