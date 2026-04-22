import java.util.*;

public class MaxOnesUsingXORSimulation
{
    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();

            int result1 = calResult(S, 1);
            int result2 = calResult(S, 0);

            System.out.println(Math.max(result1, result2));
        }
    }

    static int calResult(String S, int curr){
        int count = curr;

        for(int i = 0; i < S.length() - 1; i++){
            int bit = S.charAt(i) - '0';
            curr = curr ^ bit;
            count += curr;
        }

        return count;
    }
}