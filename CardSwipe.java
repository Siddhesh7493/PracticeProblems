import java.util.*;
import java.lang.*;
import java.io.*;

public class CardSwipe
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            HashSet<Integer>inside = new HashSet<>();
            int current=0;
            int max=0;
            for(int i=0;i<N;i++){
                int id=sc.nextInt();
                if(inside.contains(id)){
                    inside.remove(id);
                    current--;
                }else{
                    inside.add(id);
                    current++;
                    max=Math.max(max,current);
                }
            }
            System.out.println(max);

        }

    }
}
