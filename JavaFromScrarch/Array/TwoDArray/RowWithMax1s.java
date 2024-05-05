package Array.TwoDArray;
import java.util.Scanner;
public class RowWithMax1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M :: ");
        int m = sc.nextInt();
        System.out.print("Enter N :: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the " + m*n + " Element!");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        RowWithMax1s r = new RowWithMax1s();
        System.out.println(r.rowWithMax1s(arr,n,m));
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[j][i] == 1) return j;
            }
        }
        return -1;
    }
}
