package Array;
public class LastRepeatingElem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,0,1,2,3};
        System.out.println(lastRepeating(arr));
    }
    public static int lastRepeating(int[] arr){
        int lastRepeating = -1;
        for(int i=0; i< arr.length-1; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]) {
                    lastRepeating = arr[i];
                }
            }
        }
        return lastRepeating;
    }
}
