package HackerRank;
import java.util.List;
public class DiagonalDifference {
    public static void main(String[] args) {

    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                if(i==j){
                    sum += arr.get(i).get(j);
                }
            }
        }
        int n = arr.size();
        for(int i=0; i<Math.floor(n/2); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                Integer temp = arr.get(i).get(j);
                arr.get(i).set(j,arr.get(n-1-i).get(j));
                arr.get(n-i-1).set(j,temp);
            }
        }
        int sum1 = 0;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                if(i==j){
                    sum1 += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sum-sum1);
    }
}
