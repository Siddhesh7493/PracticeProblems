import java.util.*;
import java.lang.*;
import java.io.*;

 public class ChefAndFruits
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int need=Math.abs(N-M);
            if(need<=K){
                System.out.println(0);
            }else{
                System.out.println(need-K);
            }
        }

    }
}
