import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayChainGrouping
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int N = sc.nextInt();
            int X[] = new int[N];

            for(int i = 0; i < N; i++){
                X[i] = sc.nextInt();
            }

            int minCount = N;
            int maxCount = 1;

            int current = 1;

            for(int i = 0; i < N-1; i++){

                if(X[i+1] - X[i] <= 2){
                    current++;
                }else{
                    minCount = Math.min(minCount, current);
                    maxCount = Math.max(maxCount, current);
                    current = 1;
                }
            }

            minCount = Math.min(minCount, current);
            maxCount = Math.max(maxCount, current);

            System.out.println(minCount + " " + maxCount);
        }
    }
}