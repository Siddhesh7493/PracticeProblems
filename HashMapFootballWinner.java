import java.util.*;
import java.lang.*;
import java.io.*;

public class HashMapFootballWinner
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int n = sc.nextInt();

            String[] Strarr = new String[n];
            for(int i = 0; i < n; i++){
                Strarr[i] = sc.next();
            }

            HashMap<String,Integer> map = new HashMap<>();

            for(String s : Strarr){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            String winner = "";
            int max = 0;

            for(String key : map.keySet()){
                int count = map.get(key);
                if(count > max){
                    max = count;
                    winner = key;
                }
            }

            if(map.size() == 2){
                Iterator<Integer> it = map.values().iterator();
                int a = it.next();
                int b = it.next();

                if(a == b){
                    System.out.println("Draw");
                    continue;
                }
            }

            if(n == 0){
                System.out.println("Draw");
            } else {
                System.out.println(winner);
            }
        }
    }
}