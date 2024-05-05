package LeetCode;
import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println(compress(arr));
    }
    public static int compress(char[]arr){
        int idx = 0,count=1;
        arr[idx++] = arr[0];
        for(int i=1; i<arr.length; i++){
            char prev = arr[i-1];
            char curr = arr[i];
            if(prev == curr){
                count++;
            }
            else{
                if(count > 1){
                    char[] newChar = String.valueOf(count).toCharArray();
                    for(char c : newChar){
                        arr[idx++] = c;
                    }
                }
                count = 1;
                arr[idx++] = curr;
            }
        }
        if(count > 1){
            char[] newChar = String.valueOf(count).toCharArray();
            for(char c : newChar){
                arr[idx++] = c;
            }
        }
        display(arr);
        return idx;
    }
    public static void display(char[] arr){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
