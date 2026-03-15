import java.util.*;
import java.lang.*;
import java.io.*;

public class ClosestVowels
{
    static final long MOD = 1000000007;

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int N = sc.nextInt();
            String S = sc.next();

            long ans = 1;

            for(int i = 0; i < N; i++){

                char ch = S.charAt(i);

                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    continue;
                }
                else{
                    int diff1 = Math.abs(ch - 'a');
                    int diff2 = Math.abs(ch - 'e');
                    int diff3 = Math.abs(ch - 'i');
                    int diff4 = Math.abs(ch - 'o');
                    int diff5 = Math.abs(ch - 'u');

                    int minDiff = Math.min(diff1,
                            Math.min(diff2,
                                    Math.min(diff3,
                                            Math.min(diff4,diff5))));

                    int count = 0;

                    if(diff1 == minDiff) count++;
                    if(diff2 == minDiff) count++;
                    if(diff3 == minDiff) count++;
                    if(diff4 == minDiff) count++;
                    if(diff5 == minDiff) count++;

                    ans = (ans * count) % MOD;
                }
            }

            System.out.println(ans);
        }
    }
}