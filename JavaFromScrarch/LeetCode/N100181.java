package LeetCode;
import java.util.ArrayList;
import java.util.List;
public class N100181 {
    public static void main(String[] args) {
        int n  = 4 ;
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> subArray = new ArrayList<>();
        int[] num = {1,2,3,4,5};
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k=i; k<=j; k++) {
                    subArray.add(num[k]);
                }
                result.add(subArray);
                subArray =  new ArrayList<>();
            }
        }
       for (int i=0; i<result.size(); i++){
           System.out.println(result.get(i));
       }
    }
}
