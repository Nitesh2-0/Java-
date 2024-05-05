package BitMnp;
import java.util.Scanner;
public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :: ");
        int n = sc.nextInt();
        System.out.print("Enter Bit for Update 0 or 1 :: ");
        int ops = sc.nextInt();
        System.out.print("Enter position :: ");
        int pos = sc.nextInt();

        int bitMask =  1 << pos;

        if(ops == 1){
            int number = bitMask | n;
            System.out.println(number);
        }else{
            int notBitMask = ~ bitMask;
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }

    }
}
