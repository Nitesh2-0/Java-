package HackerRank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of List :: ");
        int l = sc.nextInt();
        List<Integer> list = new ArrayList<>(l);
        System.out.println("Enter " + l + " Element in List.");
        for(int i=0; i<l; i++){
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        System.out.println("How many Query have you ?");
        int n = sc.nextInt();
        while(n-->0){
            System.out.println("Tell me Operation name :: ");
            String s = sc.next().toLowerCase();
            if(s.equals("insert")){
                System.out.print("Enter the post & value :: ");
                int pos = sc.nextInt(), val = sc.nextInt();
                list.add(pos,val);
            }
            if(s.equals("delete")){
                System.out.print("Enter only post :: ");
                int post = sc.nextInt();
                list.remove(post);
            }
        }
        System.out.println(list);
    }
}
