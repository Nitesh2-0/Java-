package LeetCode;
import java.util.Scanner;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortColor(arr);
    }
    public static void sortColor(int[] color){
        int n = color.length;
        // Implementing Bubble Sort
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(color[j] > color[j+1])
                    swap(color,j,j+1);
            }
        }
        display(color);
    }
    public static void swap(int[] color, int str, int end){
           int temp = color[str];
           color[str] = color[end];
           color[end] = temp;
    }
    public static void display(int[]color){
        for(Integer it : color){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
