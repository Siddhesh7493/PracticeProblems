import java.util.*;
public class SubtractionToGCD {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            while (X != 0) {
                int temp = X;
                X = Y % X;
                Y = temp;
            }

            System.out.println(Y);
        }
    }
}