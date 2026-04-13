import java.util.*;
import java.lang.*;
import java.io.*;

public class SubsequenceCheck
{
    public static boolean isSubsequence(String a, String b){
        int i = 0, j = 0;

        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
            }
            j++;
        }

        return i == a.length();
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            String M = sc.next();
            String W = sc.next();

            if(isSubsequence(M, W) || isSubsequence(W, M)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}