package HackerRank;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of testcase :: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int limit = sc.nextInt();
            ArrayList<Integer> arraylist = new ArrayList<>();
            for(int j=0; j<limit; j++){
                arraylist.add(sc.nextInt());
            }
            list.add(arraylist);
        }
        System.out.print("Enter the number of query :: ");
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x-1).get(y-1));
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
