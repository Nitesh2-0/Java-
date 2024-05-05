package GeeksForGeeks;

public class SwapTheArrayElement {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,2,3,4,5,6};

        for(int i=0; i<n-2; i++){
            int temp = arr[i+2];
            arr[i+2] = arr[i];
            arr[i] = temp;
        }

        for(Integer k : arr){
            System.out.print(k + " ");
        }

    }
}
