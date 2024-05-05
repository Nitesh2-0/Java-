package Array;

public class UniqueElem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[]arr){
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i] != -1) return arr[i];
        }
        return -1;
    }
}
