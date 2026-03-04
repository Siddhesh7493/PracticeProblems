import java.util.*;
import java.lang.*;
import java.io.*;

public class SpellShortening
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();
            int big=N-1;
            for(int i=0;i<N-1;i++){
                if(S.charAt(i)>S.charAt(i+1)){
                    big=i;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder(S);
            sb.deleteCharAt(big);
            System.out.println(sb.toString());
        }

    }
}
