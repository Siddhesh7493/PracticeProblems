import java.util.*;
import java.lang.*;
import java.io.*;

public class StringGame
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String s = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            for(char c: s.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }
            boolean possible = true;
            for(int freq : map.values()){
                if(freq%2!=0){
                    possible=false;
                    break;
                }
            }
            if(possible){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

