import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxBinary
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            StringBuffer sb = new StringBuffer(S);

            if(sb.charAt(0)=='0'){
                sb.setCharAt(0,'1');
                K--;
            }
            for(int i=0;i<K;i++){
                sb.append('0');
            }
            System.out.println(sb.toString());
        }

    }
}
