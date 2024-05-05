package GeeksForGeeks;
public class FakeCertificationDetection {
    public static void main(String[] args) {
        int n = 6;
        String str = "010010";
        int maxConsecutiveZeros = 0;
        int currentConsecutiveZeros = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                currentConsecutiveZeros++;
                maxConsecutiveZeros = Math.max(maxConsecutiveZeros, currentConsecutiveZeros);
            } else {
                currentConsecutiveZeros = 0;
            }
        }
        for(int i=0; i<n; i++){

        }
        System.out.println(maxConsecutiveZeros);
    }
}
