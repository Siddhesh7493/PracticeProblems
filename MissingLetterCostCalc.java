import java.util.*;
import java.lang.*;
import java.io.*;

public class MissingLetterCostCalc
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int[] price = new int[26];
            int sum = 0;
            for(int i = 0; i < 26; i++){
                price[i] = sc.nextInt();
                sum += price[i];
            }

            String S = sc.next();

            HashSet<Character> set1 = new HashSet<>();
            for(char c : S.toCharArray()){
                set1.add(c);
            }

            int sum1 = 0;
            for(char c : set1){
                sum1 += price[c - 'a'];
            }

            System.out.println(sum - sum1);
        }
    }
}