import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimizeRangeAfterSwaps
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int A[]=new int[N];
            int B[]=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++){
                B[i]=sc.nextInt();
            }

            int C[]=new int[2*N];
            for(int i=0;i<N;i++){
                C[i]=A[i];
                C[i+N]=B[i];
            }
            Arrays.sort(C);

            int ans=Integer.MAX_VALUE;
            for(int i=0;i+N-1<2*N;i++){
                int min=C[i];
                int max=C[i+N-1];
                int range=max-min;
                ans=Math.min(ans,range);
            }
            System.out.println(ans);
        }

    }
}
