package Array.TwoDArray;
import java.util.Scanner;
public class MatrixTranspose {
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
        int[][] transpose = matrixTranspose(arr,r,c);
        display(transpose);
        int[][] matrixInPlace = matrixTransposeInPlace(arr);
        display(matrixInPlace);
    }
    public static int[][] matrixTranspose(int[][] arr,int r,int c){
        int[][] ans = new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    public static int[][] matrixTransposeInPlace(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void display(int[][] crr){
        for(int i=0; i<crr.length; i++){
            for(int j=0; j<crr[i].length; j++){
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
