import java.util.*;
import java.lang.*;
import java.io.*;

public class DominantElement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num:A){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int highfreq = 0;
            for (int freq : map.values()) {
                if (freq > highfreq) {
                    highfreq = freq;
                }
            }

            int occurrencesOfMax = 0;
            for (int freq : map.values()) {
                if (freq == highfreq) {
                    occurrencesOfMax++;
                }
            }

            if (occurrencesOfMax == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
