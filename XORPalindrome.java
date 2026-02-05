import java.util.*;
import java.io.*;

 public class XORPalindrome {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();

            int mismatches = 0;
            for (int i = 0; i < N / 2; i++) {
                if (A.charAt(i) != A.charAt(N - 1 - i)) {
                    mismatches++;
                }
            }

            System.out.println((int) Math.ceil(mismatches / 2.0));
        }
    }
}