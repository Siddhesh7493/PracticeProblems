import java.util.*;

public class PalindromeWithXDistinct  {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            if (X > (N + 1) / 2) {
                System.out.println(-1);
                continue;
            }

            char[] res = new char[N];

            for (int i = 0; i < X; i++) {
                res[i] = (char) ('a' + i);
                res[N - 1 - i] = res[i];
            }

            for (int i = X; i <= N - 1 - X; i++) {
                res[i] = 'a';
            }

            System.out.println(new String(res));
        }
    }
}