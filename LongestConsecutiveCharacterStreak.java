import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestConsecutiveCharacterStreak
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int Q = sc.nextInt();
            String S = sc.next();

            int substringlength = 1;
            int freqElem = 1;

            for(int i = 1; i < N; i++){
                if(S.charAt(i) == S.charAt(i-1)){
                    freqElem++;
                } else {
                    substringlength = Math.max(substringlength, freqElem);
                    freqElem = 1;
                }
            }
            substringlength = Math.max(substringlength, freqElem);

            System.out.print(substringlength + " ");

            char last = S.charAt(N-1);

            for(int i = 0; i < Q; i++){
                char c = sc.next().charAt(0);

                if(c == last){
                    freqElem++;
                } else {
                    freqElem = 1;
                }

                substringlength = Math.max(substringlength, freqElem);
                last = c;

                System.out.print(substringlength + " ");
            }

            System.out.println();
        }
    }
}