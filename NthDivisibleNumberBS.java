import java.util.*;
import java.io.*;

class Solution {

    public int beautifulSeq(int n, int x, int y) {
        long low = 1, high = (long)1e18;
        long lcm = lcm(x, y);

        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = (mid / x) + (mid / y) - (mid / lcm);

            if (count < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int) low;
    }

    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    private long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

public class NthDivisibleNumberBS {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Solution Obj = new Solution();
        System.out.print(Obj.beautifulSeq(n, x, y));
        sc.close();
    }
}
