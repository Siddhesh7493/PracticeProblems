import java.util.*;
import java.lang.*;
import java.io.*;

public class TravelPass
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            String s = sc.next();
            /*Map<Character, Integer> counts = new HashMap<>();

            int f=0;
            int g=0;
            for (char ca : s.toCharArray()) {
                counts.put(ca, counts.getOrDefault(ca, 0) + 1);
            }
            f=counts.getOrDefault('0',0);
            g=counts.getOrDefault('1',0);
            int ans = f*A + g*B;
            System.out.println(ans);
            */
            int countA=0;
            int countB=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    countA++;
                }else{
                    countB++;
                }
            }
            int ans = countA*A + countB*B;
            System.out.println(ans);
        }

    }
}
