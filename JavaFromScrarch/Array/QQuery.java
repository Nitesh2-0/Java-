package Array;
import java.util.Scanner;
public class QQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] freq = frequencyArray(arr);
        System.out.print("Enter number of Query :: ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter number that you want to check.");
            int num = sc.nextInt();
            if(freq[num] > 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static int[] frequencyArray(int[] arr){
//        in supervision where size of array 10^5
        int[] freq = new int[100005];
        for(int i=0; i< arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
