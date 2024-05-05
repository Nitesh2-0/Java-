package HackerRank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> ans = Arrays.asList(1,1,2,2,4,4,5,5,5);
        System.out.println(pickingNumbers(ans));
    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int maxi = 1,curr=0;
        for(int i=0; i<a.size(); i++){
            for(int j=i+1; j<a.size(); j++){
                int cal = Math.abs((a.get(i)-a.get(j)));
                if(cal <= 1){
                    maxi++;
                }
            }
            curr = Math.max(maxi,curr);
            maxi = 1;
        }

        return curr;
    }
}
