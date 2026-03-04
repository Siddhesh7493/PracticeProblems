import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefAndStringShift
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String S = sc.next();
            int N = S.length();

            StringBuilder leftshift = new StringBuilder();
            StringBuilder rightshift = new StringBuilder();

            for(int i = 1; i < N; i++){
                leftshift.append(S.charAt(i));
            }
            leftshift.append(S.charAt(0));

            rightshift.append(S.charAt(N-1));
            for(int i = 0; i < N-1; i++){
                rightshift.append(S.charAt(i));
            }

            if(leftshift.toString().equals(rightshift.toString())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
