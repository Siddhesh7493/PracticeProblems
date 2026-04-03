import java.util.*;
import java.lang.*;
import java.io.*;

public class KnockoutTournamentAnalysis
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){

            int S[] = new int[16];
            for(int i = 0; i < 16; i++){
                S[i] = sc.nextInt();
            }

            int sorted[] = S.clone();
            Arrays.sort(sorted);

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i = 0; i < 16; i++){
                int wins = 0;

                if(i == 0) wins = 0;
                else if(i <= 2) wins = 1;
                else if(i <= 6) wins = 2;
                else if(i <= 14) wins = 3;
                else wins = 4;

                map.put(sorted[i], wins);
            }

            for(int i = 0; i < 16; i++){
                System.out.print(map.get(S[i]) + " ");
            }
            System.out.println();
        }
    }
}