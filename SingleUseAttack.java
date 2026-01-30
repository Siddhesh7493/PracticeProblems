import java.util.*;
import java.lang.*;
import java.io.*;

 public class SingleUseAttack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int rem = H-Y;
            if(rem%X!=0){
                System.out.println(rem/X+2);
            }else{
                System.out.println(rem/X+1);
            }
        }

    }
}
