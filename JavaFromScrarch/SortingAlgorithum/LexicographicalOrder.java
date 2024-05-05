package SortingAlgorithum;
import java.util.Scanner;
public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        lexicographical(str);
    }
    static void lexicographical(String[] str){
        int n = str.length;
        for(int i=0; i<n-1; i++){
           int minIdx = i;
           for(int j=i+1; j<n; j++){
               if(str[j].compareTo(str[minIdx]) < 0){
                   minIdx = j;
               }
           }
           if(minIdx != i){
               String temp = str[i];
               str[i] = str[minIdx];
               str [minIdx] = temp;
           }
        }
        display(str);
    }
    static void display(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
