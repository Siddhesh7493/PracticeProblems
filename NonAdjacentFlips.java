import java.util.*;
import java.lang.*;
import java.io.*;

 public class NonAdjacentFlips
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();

            if (!S.contains("1")) {
                System.out.println(0);
            }
            else {
                boolean hasAdjacentOnes = false;
                for (int i = 0; i < N - 1; i++) {
                    if (S.charAt(i) == '1' && S.charAt(i+1) == '1') {
                        hasAdjacentOnes = true;
                        break;
                    }
                }

                if (hasAdjacentOnes) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
        }

    }
}
