package Array.TwoDArray;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of pascal triangle");
        int n = sc.nextInt();
        pascalTriangle(n);
    }
    public static void pascalTriangle(int n){
        int[][] pascals = new int[n][];
        for(int i=0; i<n; i++){
            pascals[i] = new int[i+1];
            pascals[i][0]=pascals[i][i]=1;
            for(int j=1; j<i; j++){
                pascals[i][j] = pascals[i-1][j-1] + pascals[i-1][j];
            }
        }
        display(pascals);
    }
    public static void display(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
           }
            System.out.println();
        }
    }
}
