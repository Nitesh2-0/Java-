package LeetCode;
public class SmallestSubsequenceDistinctCharacters {
    public static void main(String[] args) {
//        Un-complete
        String str = "bcabc";
        String store = "";
        int n = str.length(),prevLen = 0;
        for(int i=0; i<=n; i++){
            for(int j=i; j<=n; j++){
               String currString = str.substring(i,j);
                System.out.println(currString + " ");
               int currLen = currString.length();
               if(isDuplicatePresent(currString) && prevLen < currLen){
                   store = currString;
                   prevLen = currLen;
               }
            }
            System.out.println();
        }
        System.out.println(store);
    }
    static boolean isDuplicatePresent(String Str){
        int n = Str.length();
        int str = 0 , end = n-1;
        while(str <= end){
            char prev = Str.charAt(str);
            char curr = Str.charAt(end);
            if(prev == curr) return false;
            str++; end--;
        }
        return true;
    }
}
