import java.util.*;
import java.lang.*;
import java.io.*;

public class PossibleGCDValues
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int D = Math.abs(A - B);
            int count = 0;

            for(int i = 1; i * i <= D; i++){
                if(D % i == 0){
                    if(i * i == D) count++;
                    else count += 2;
                }
            }

            System.out.println(count);
        }
    }
}