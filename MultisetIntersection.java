import java.util.*;
import java.lang.*;
import java.io.*;

public class MultisetIntersection
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String A = sc.next();
            String B = sc.next();
            HashMap<Character,Integer>map1=new HashMap<>();
            for(char c:A.toCharArray()){
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
            HashMap<Character,Integer>map2=new HashMap<>();
            for(char c:B.toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            int count=0;
            for(char c : map1.keySet()){
                if(map2.containsKey(c)){
                    count += Math.min(map1.get(c), map2.get(c));
                }
            }
            System.out.println(count);
        }

    }
}
