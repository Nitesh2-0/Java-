package GeeksForGeeks.Top50StringProblem;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        int n = 4;
        String[] arr = {"geekforgeeks", "geeks", "geek", "geezer"};
        String common = arr[0];
        for(int i=1; i<4; i++){
            common = commonPrefix(common,arr[i]);
        }
        System.out.println(common);
    }
    public static String commonPrefix(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        int i=0,j=0;
        String commonPart = "";
        while(i<n1 && j<n2){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if(ch1 != ch2){
                break;
            }else{
                commonPart += ch1;
            }
            i++; j++;
        }
        return commonPart;
    }
}
