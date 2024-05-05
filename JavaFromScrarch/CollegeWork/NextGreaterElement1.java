package CollegeWork;
import java.util.ArrayList;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] num = {4,1,2};
        int[] arr = {1,2,3,4};
        int[] newElm = new int[num.length];
        boolean flg = false;
        for(int i=0; i<num.length; i++){
            int val = 0;
            for(int j=0; j<arr.length; j++){
                int targ = num[i];
                if(!(arr[j] == targ)){
                    int str = j;
                    while(str < arr.length){
                        if(arr[str] > targ) {
                            val = arr[j];
                            flg  = true;
                            break;
                        }
                        str++;
                    }
                    break;
                }
            }
            if(flg){
                newElm[i] = val;
            }else{
                newElm[i] = -1;
            }
        }
        for(Integer k : newElm){
            System.out.println(k);
        }
    }
}
