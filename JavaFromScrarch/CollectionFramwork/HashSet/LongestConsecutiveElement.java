package CollectionFramwork.HashSet;
import java.util.HashSet;
import java.util.Scanner;
public class LongestConsecutiveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Element will be in the array :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Longest Common Sequence :: " + longestCommonSequence(arr));
    }
    static int longestCommonSequence(int[] num){
        HashSet<Integer> s = new HashSet<>();
        int maxStreak = 0;
        for(Integer i : num) s.add(i);
        for(Integer tr : s){
            if(!s.contains(tr-1)){
                int currNum = tr;
                int currStreak = 1;
                while(s.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currNum);
            }
        }
        return maxStreak;
    }
}
