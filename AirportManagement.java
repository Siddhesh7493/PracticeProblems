import java.util.*;
import java.lang.*;
import java.io.*;

public class AirportManagement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();

            int A[] = new int[N];
            int D[] = new int[N];

            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }

            for(int i=0;i<N;i++){
                D[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i : A){
                map.put(i, map.getOrDefault(i,0) + 1);
            }

            for(int j : D){
                map.put(j, map.getOrDefault(j,0) + 1);
            }

            int maxFreq = 0;

            for(int value : map.values()){
                maxFreq = Math.max(maxFreq, value);
            }

            System.out.println(maxFreq);
        }
    }
}