import java.util.*;
import java.lang.*;
import java.io.*;

public class SortedPlaylist
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int A[]=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int K = sc.nextInt();
            int pos=A[K-1];
            Arrays.sort(A);
            int count=0;
            for(int Key:A){
                if(Key==pos){
                    break;
                }else{
                    count++;
                }
            }

            System.out.println(count+1);

        }

    }
}
