package Array.TwoDArray;
import java.util.Scanner;
public class Search2DMatrix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the M :: ");
        int n = sc.nextInt();
        System.out.print("Enter thr N :: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter " + m*n + " Element!");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Target Value :: ");
        int value = sc.nextInt();
        System.out.println(searchMatrix(arr,value));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
         // TC - O(log(m*n)
         int n = matrix.length; int m = matrix[0].length;
         int i=0 , j=m-1;
         while(i<n && j>=0){
             if(matrix[i][j]==target) return true;
             else if(matrix[i][j] > target) j--;
             else i++;
         }
        return false;
    }
}
