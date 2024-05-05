package Array;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class DeepCopy {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int[] arr ={1,3,5,8,69,8,85,1};

        System.out.println("Original Arrays !!");
        printArray(arr);
//        Performed Shallow  Copy because Original Array changed
        System.out.println("Copies Arrays !!");
        int []brr = arr;
        brr[0] = -1;
        printArray(brr);

        System.out.println("Original Arrays !!!");
        printArray(arr);

//        Deep copy, here original array will same like previous 1st Method
        System.out.println("Copies Element !!");
        int []cr = arr.clone();
        cr[0] = -4;
        cr[3] = -78;
        printArray(cr);

        System.out.println("Original Array !!!");
        printArray(arr);

//        Deep copy, here original array will same like previous 2nd Method
        System.out.println("Copies Element !!");
        int []dr = Arrays.copyOf(arr,arr.length);
        dr[0] = -4;
        dr[3] = -78;
        printArray(dr);

        System.out.println("Original Array !!!");
        printArray(arr);

//      Deep copy, here original array will same like previous 2nd Method
        System.out.println("Copies Element !!");
        int []er = Arrays.copyOfRange(arr,0,4);
        er[1] = -4;
        er[3] = -78;
        printArray(er);

        System.out.println("Original Array !!!");
        printArray(arr);
    }
    public static void printArray(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
