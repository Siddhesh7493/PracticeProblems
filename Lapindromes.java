import java.util.*;
import java.lang.*;
import java.io.*;

public class Lapindromes
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String S = sc.next();
            HashMap<Character,Integer> map = new HashMap<>();
            int mid = S.length()/2;
            String left = S.substring(0,mid);
            String right = S.length()%2==0?S.substring(mid):S.substring(mid+1);
            for(char c : left.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(char c : right.toCharArray()){
                map.put(c,map.getOrDefault(c,0)-1);
            }
            boolean isAllZero = true;
            for(int num : map.values()){
                if(num!=0){
                    isAllZero = false;
                }
            }
            if(isAllZero){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
