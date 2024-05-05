package Array.TwoDArray;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and colum :: ");
        int r = sc.nextInt(); int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + r*c + " Element");
        for(int i=0; i<r; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row and colum :: ");
        int r1 = sc.nextInt(); int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter " + r1*c1 + " Element");
        for(int i=0; i<r1; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        additionOfTwoMatrix(arr,r,c,arr1,r1,c1);
    }
    public static void additionOfTwoMatrix(int[][] arr,int r, int c,int[][] arr1,int r1,int c1){
        int[][] ans = new int[r][r1];
        if(r != r1 || c1 != c) return ;
        for(int i=0; i<r; i++){
            for (int j=0; j<r1; j++){
                ans[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        display(ans,r);
    }
    public static void display(int[][] arr,int r){
        for(int i=0; i<r; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
