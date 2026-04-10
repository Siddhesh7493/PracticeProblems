import java.util.*;
import java.lang.*;
import java.io.*;

public class ModeOfFrequencies
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int A[]=new int[N];
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }

            for(int i : A){
                map.put(i,map.getOrDefault(i,0)+1);
            }

            HashMap<Integer,Integer> map1 = new HashMap<>();
            for(int i:map.values()){
                map1.put(i,map1.getOrDefault(i,0)+1);
            }

            int mode = 0;
            int maxCount = 0;

            for(int i:map1.keySet()){
                int count = map1.get(i);

                if(count > maxCount){
                    maxCount = count;
                    mode = i;
                }
                else if(count == maxCount){
                    mode = Math.min(mode, i);
                }
            }

            System.out.println(mode);
        }
    }
}