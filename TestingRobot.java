import java.util.*;
import java.lang.*;
import java.io.*;

 public class TestingRobot
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc = new Scanner(System.in);
       int T=sc.nextInt();
       while (T-- > 0){
           int N=sc.nextInt();
           int X=sc.nextInt();
           String S=sc.next();
           HashSet<Integer> set=new HashSet<>();
           set.add(X);
           for(char c:S.toCharArray()){
               if(c=='R'){
                   X++;
               }else{
                   X--;
               }
               set.add(X);
           }
           System.out.println(set.size());
       }

    }
}
