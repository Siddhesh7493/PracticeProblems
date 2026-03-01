import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumAlternatingSum
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int A[] = new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int lowsum=0;
            int highsum=0;
            Arrays.sort(A);
            for(int i=0;i<=N/2-1;i++){
                lowsum+=A[i];
            }
            for(int i=N/2;i<N;i++){
                highsum+=A[i];
            }
            int ans = (highsum-lowsum);
            System.out.println(ans);
        }

    }
}
