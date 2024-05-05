package BitMnp;

public class getBit {
    public static void main(String[] args) {
        int bit = 5; // 0101
        int pos = 3;

        int bitMask = 1 << pos;
        if((bitMask & bit) == 0){
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was one");
        }
    }
}
