package GeeksForGeeks;
import java.util.HashSet;

public class SubArray2317 {
    public static void main(String[] args) {
        int[] main = {1,2,3,4,5,6,7,8};
        int[] sub  = {1,2,3,1};
        HashSet<Integer> elm = new HashSet<>();
        for(int k : main){
            elm.add(k);
        }
        boolean tracking = true;
        for(int l : sub){
            if(!elm.contains(l)) {
                tracking = false;
                break;
            }
        }
        if(tracking) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
