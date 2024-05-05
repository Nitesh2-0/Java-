package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++) {
            int j = 0;
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print("   ");
            }
            for (; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            int k = i;
            for(int j=0; j<k; j++){
                System.out.print("   ");
            }
            for(; k<=n-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
