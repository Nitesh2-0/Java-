package Array.TwoDArray.PrefixSum;
import java.util.Scanner;
public class RectangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and colum :: ");
        int row = sc.nextInt(), colum = sc.nextInt();
        int[][] matrix = new int[row][colum];
        for (int i=0; i<row; i++){
            for (int j=0; j<colum; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter initial point of rectangle :: ");
        int l1 = sc.nextInt(), r1= sc.nextInt();
        System.out.print("Enter final point of rectangle :: ");
        int l2 = sc.nextInt(), r2= sc.nextInt();
        int totalSum = basicApproach(matrix,l1,r1,l2,r2);
        System.out.println("TotalSum = " + totalSum);
        System.out.println("TotalSum = " + moderateApproach(matrix,l1,r1,l2,r2));
    }
    public static int basicApproach(int[][]arr,int l1,int r1,int l2, int r2){
        int totalSum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                totalSum += arr[i][j];
            }
        }
        return totalSum;
    }
    public static int moderateApproach(int[][]arr, int l1,int r1, int l2, int r2){
        int ans= 0, sum = 0, left = 0, top = 0, LeftTopUp = 0;
        prefixSum(arr);
        sum = arr[l2][r2];
        if(r1 > 0) {
            left = arr[l2][r1 - 1];
        }
        if(l1 > 0) {
            top = arr[l1 - 1][r2];
        }
        if(l1 > 0 && r1 > 0) {
            LeftTopUp = arr[l1 - 1][r1 - 1];
        }
        ans = sum - left - top + LeftTopUp;
        return ans;
    }
    public static void prefixSum(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
