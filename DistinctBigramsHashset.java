import java.util.*;
import java.lang.*;
import java.io.*;

public class DistinctBigramsHashset
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String S = sc.next();
            HashSet<String> set=new HashSet<>();
            for(int i=0;i<S.length()-1;i++){
                String twoLetters = S.substring(i, i + 2);
                set.add(twoLetters);
            }
            System.out.println(set.size());
        }
    }
}
