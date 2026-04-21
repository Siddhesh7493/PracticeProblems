import java.util.*;

public class MaxFrequencyApproach
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
                map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            }

            int maxFreq = 0;
            for(int freq : map.values()){
                if(freq > maxFreq){
                    maxFreq = freq;
                }
            }

            int finalAns = N - maxFreq;
            System.out.println(finalAns);
        }
    }
}