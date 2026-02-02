import java.util.*;
import java.lang.*;
import java.io.*;

public class PetStore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int elem : arr){
                map.put(elem,map.getOrDefault(elem,0)+1);
            }

            boolean isPossible=true;
            for(int freq : map.values()){
                if(freq%2!=0){
                    isPossible=false;
                    break;
                }
            }
            if(isPossible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
