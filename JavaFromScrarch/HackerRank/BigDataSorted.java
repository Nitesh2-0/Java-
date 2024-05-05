package HackerRank;
import java.util.Arrays;

public class BigDataSorted {
    public static void main(String[] args) {
        /*String[] arr = {"1","2","10","20","91"};
        Arrays.sort(arr);
        for(String str : arr){
            System.out.println(str);
        }*/
        String ref = "Hello World";
        String[] arr = ref.split(" ");
        int str = 0, end = arr.length-1;
        while(str < end){
            String temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++; end--;
        }
       String d = Arrays.toString(arr);
        String a = "";
        for(int i=0; i<d.length(); i++){
            if(d.charAt(i) != ','){
                a += d.charAt(i);
            }else if(d.charAt(i)=='[' || d.charAt(i)==']'){
            }
            else{
                a += " ";
            }
        }
        System.out.println(a);
    }
}
