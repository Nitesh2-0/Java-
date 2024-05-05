package GeeksForGeeks;
public class PairSum {
    public static void main(String[] args) {
        int [][]mat1  = {{1,2}, {3,4}};
        int [][]mat2 = {{5,6}, {7,8}};
        int x = 10;
        int i = 0 , j = 0, a = mat1[0].length-1, b = mat1[0].length-1, n = mat2.length;
        int ans = 0;
        while(i < n && a >= 0){
            if(mat1[i][j]+mat2[a][b]==x){
                ans++;
                if(j==n-1){
                    i++;
                    j=0;
                }else{
                    j++;
                }
                if(b==0){
                    a--;
                    b=n-1;
                }else{
                    b--;
                }
            }else if(mat1[i][j]+mat2[a][b] < x){
                if(j==n-1){
                    i++;
                    j=0;
                }else{
                    j++;
                }
            }else{
                if(b==0){
                    a--;
                    b = n-1;
                }else{
                    b--;
                }
            }
        }
        System.out.println(ans);
    }
}
