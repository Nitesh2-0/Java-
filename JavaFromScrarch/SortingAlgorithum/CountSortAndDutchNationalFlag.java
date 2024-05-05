package SortingAlgorithum;
import java.util.Scanner;
public class CountSortAndDutchNationalFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        System.out.print("Enter the " + n + " Element :: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortByCount(arr);
        sort012(arr);
    }
    static void sortByCount(int[] num){
        //Complexity - T=>O(n) - S=>O(n)
        int zero = 0 , one = 0 , two = 0;
        for(int k : num){
            if(k==0) zero++;
            else if(k==1) one++;
            else two++;
        }
        int k = 0;
        for(int i=0; i<zero; i++) num[k++] = 0;
        for(int j=0; j<one; j++)  num[k++] = 1;
        for(int l=0; l<two; l++)  num[k++] = 2;

      display(num);
    }
    static void sort012(int[] arr){
        //Complexity - T=>O(n) - S=>(1)
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        display(arr);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    static void display(int[] arr){
        for(int m : arr){
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
