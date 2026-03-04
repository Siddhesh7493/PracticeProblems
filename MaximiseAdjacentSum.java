import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximiseAdjacentSum
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int A[] = new int[N];
            long sum = 0;

            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
                sum += A[i];
            }

            Arrays.sort(A);

            long ans = 2*sum - A[0] - A[1];

            System.out.println(ans);
        }
    }
}