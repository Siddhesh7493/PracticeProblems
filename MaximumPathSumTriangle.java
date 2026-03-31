import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumPathSumTriangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int triangle[][]=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<=i;j++){
                    triangle[i][j]=sc.nextInt();
                }
            }
            for(int i=N-2;i>=0;i--){
                for(int j=0;j<=i;j++){
                    int sumbelow = triangle[i+1][j];
                    int sumright = triangle[i+1][j+1];
                    triangle[i][j] += Math.max(sumbelow,sumright);
                }
            }
            System.out.println(triangle[0][0]);
        }

    }
}
