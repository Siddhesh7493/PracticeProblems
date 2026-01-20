import java.util.*;
import java.lang.*;
import java.io.*;

 public class ChefAndGroups
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String s = sc.next();
            int count = 0;
            boolean inGroup = false;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='1'){
                    if(!inGroup){
                        count++;
                        inGroup=true;
                    }
                }else{
                    inGroup=false;
                }
            }
            System.out.println(count);

        }

    }
}
