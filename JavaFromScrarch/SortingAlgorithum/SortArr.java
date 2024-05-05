package SortingAlgorithum;
import java.util.Scanner;;
public class SortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :: ");
        int n = sc.nextInt();
        System.out.print("Enter the " + n + " Element :: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    static void sort(int[] num){
        int n = num.length;
        int x=-1,y=-1;
        boolean flag = false;
        for(int i=1; i<n; i++){
            if(num[i-1] > num[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                    flag =true;
                }
                else{
                    y=i;
                    flag = true;
                }
            }

        }
        if(!flag) return ;
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
}
