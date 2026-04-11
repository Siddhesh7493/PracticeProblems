import java.util.*;
import java.lang.*;
import java.io.*;

public class GoodPairsUsingFrequencyMap
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < N; i++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            long goodpairs = 0;

            for(int freq : map.values()){
                goodpairs += (long)freq * (freq - 1) / 2;
            }

            System.out.println(goodpairs);
        }
    }
}