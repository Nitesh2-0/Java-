package HackerEarth;
public class CommentSection {
    public static void main(String[] args) {

    }
    static int solution(int N, String S, String[] comments){
        int result = 0;
        for(int i=0; i<N; i++){
            String[] st = comments[i].toLowerCase().split("_");
            for(int j=0; j<st.length; j++){
                if(st[j].equals(S.toLowerCase())) result++;
            }
        }
        return result;

    }
}
