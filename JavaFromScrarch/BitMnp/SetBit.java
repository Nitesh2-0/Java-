package BitMnp;

public class SetBit {
    public static void main(String[] args) {
        int bit = 5; // 0101
        int pos = 2; // 0010

        int bitMask = 1 << 3;
        int newNumber = bitMask | bit;
        System.out.println(newNumber);
    }
}
