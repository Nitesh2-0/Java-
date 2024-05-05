package DString;
import java.util.Scanner;
public class stringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line of statement :: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        for(String s : arr){
            System.out.print(s + " ");
        }
    }
}
