package Array.TwoDArray;
import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and colum :: ");
        int row = sc.nextInt(), colum = sc.nextInt();
        int[][] arr = new int[row][colum];
        for (int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        rotatedMatrix(arr,row,colum);
    }
    public static void rotatedMatrix(int[][] matrix, int row, int colum){
        for(int i=0; i<row; i++){
            for(int j=i; j<colum; j++){
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        Code => reverse row wise
        for(int i=0; i<colum; i++){
            reverseRowWise(matrix[i]);
        }
        display(matrix);
    }
    public static void reverseRowWise(int[] arr){
        int str = 0 , end = arr.length-1;
        while (str <= end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++; end--;
        }
    }
    public static void display(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
