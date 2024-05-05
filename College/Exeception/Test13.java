package Exeception;
import java.util.Scanner; 
public class Test13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            printed(n);
        }
        catch(Error e){
            System.out.println(e);
        }
    }
    static void printed(int n) throws Exception{
        if(n > 25) {
          throw new Exception("Custom Exeception");
        }
        else{
            for(int i=1; i<=n; i++){
                System.out.print(25*i + " ");
            }
        }
    }
}
