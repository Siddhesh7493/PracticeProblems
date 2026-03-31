import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimizeAverageByMerging
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int conc[]=new int[N];
            for(int i=0;i<N;i++){
                conc[i]=sc.nextInt();
            }
            Arrays.sort(conc);
            double sortedArray[]=new double[N];
            for(int i=0;i<N;i++){
                sortedArray[i]=conc[N-1-i];
            }
            double sum=sortedArray[0];
            for(int j=1;j<N;j++){
                sum+=sortedArray[j];
                double minconc=sum/2.0;
                sum=minconc;
            }
            System.out.printf("%.8f\n",sum);
        }
    }
}
