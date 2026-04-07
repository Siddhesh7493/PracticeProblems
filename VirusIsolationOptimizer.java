import java.util.*;

public class VirusIsolationOptimizer
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int Q = sc.nextInt();
            String S = sc.next();

            int[] freq = new int[26];

            for(char c : S.toCharArray()){
                freq[c - 'a']++;
            }

            while(Q-- > 0){
                int C = sc.nextInt();
                int pending = 0;

                for(int i = 0; i < 26; i++){
                    if(freq[i] > C){
                        pending += (freq[i] - C);
                    }
                }

                System.out.println(pending);
            }
        }
    }
}