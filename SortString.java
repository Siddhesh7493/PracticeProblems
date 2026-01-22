import java.util.*;
import java.lang.*;
import java.io.*;

public class SortString {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int operations = 0;
            boolean seenOne = false;

            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    seenOne = true;
                } else if (seenOne) {
                    operations++;
                    while (i < N && S.charAt(i) == '0') {
                        i++;
                    }
                    i--;
                }
            }
            System.out.println(operations);
        }
    }
}