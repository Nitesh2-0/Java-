package Array;

public class FirstRepeatingElem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(firstRepeating(arr));
    }
    public static int firstRepeating(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
}
