import java.util.*;
import java.lang.*;
import java.io.*;

public class SubsetAdditionValidator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A[]=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int B[]=new int[N];
            for(int i=0;i<N;i++){
                B[i]=sc.nextInt();
            }
            boolean isOddDiff=false;
            for(int i=0;i<N;i++){
                int diff = B[i]-A[i];
                if(diff==X || diff==Y){
                    continue;
                }else{
                    isOddDiff=true;
                }
            }
            if(isOddDiff){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }

        }

    }
}
