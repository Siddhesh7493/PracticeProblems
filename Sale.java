import java.util.*;
import java.lang.*;
import java.io.*;

public class Sale {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int lastElement = A[N - 1];

            Arrays.sort(A);
            int maxAfterSort = A[N - 1];

            long maxProfit = 0;

            if (lastElement == maxAfterSort) {
                long sum = 0;
                for (int val : A) {
                    sum += val;
                }
                maxProfit = sum + maxAfterSort;
                System.out.println(maxProfit);
            } else {
                maxProfit = (long) maxAfterSort * 2;
                System.out.println(maxProfit);
            }
        }
    }
}