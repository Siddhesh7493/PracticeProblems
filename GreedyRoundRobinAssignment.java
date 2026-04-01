import java.util.*;
import java.lang.*;
import java.io.*;

public class GreedyRoundRobinAssignment
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();

            if((long)K * L < N){
                System.out.println(-1);
                continue;
            }

            if(K == 1){
                if(N > 1){
                    System.out.println(-1);
                } else {
                    System.out.println(1);
                }
                continue;
            }

            int[] count = new int[K+1];
            int last = -1;
            int player = 1;

            for(int i = 0; i < N; i++){
                int tries = 0;

                while((player == last) || count[player] >= L){
                    player++;
                    if(player > K) player = 1;

                    tries++;
                    if(tries > K){
                        System.out.println(-1);
                        return;
                    }
                }

                System.out.print(player + " ");
                count[player]++;
                last = player;

                player++;
                if(player > K) player = 1;
            }
            System.out.println("");
        }
    }
}
