package LeetCode;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of String :: ");
        int n = sc.nextInt();
        char [] ch = new char[n];
        for (int i=0; i<ch.length; i++){
            ch[i] = sc.next().charAt(0);
        }
        reverseString(ch);
    }
    public static void reverseString(char[] ch){
        int str = 0, end = ch.length-1;
        while (str <= end){
            swap(ch,str,end);
            str++;
            end--;
        }
        display(ch);
    }
    public static void swap(char[] ch , int str, int end){
        char temp = ch[str];
        ch[str] = ch[end];
        ch[end] = temp;
    }
    public static void display(char[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
