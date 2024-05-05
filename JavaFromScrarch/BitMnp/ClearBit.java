package BitMnp;

public class ClearBit {
    public static void main(String[] args) {
        int bit = 5; // 0101
        int pos = 2;

        int bitMask = 1 << pos;
        int notBitMask = ~ bitMask;
        int newNumber  = notBitMask & bit;

        System.out.println(newNumber);
    }
}
