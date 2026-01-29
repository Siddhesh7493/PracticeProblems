import java.util.*;
import java.lang.*;
import java.io.*;

 public class AlternatingString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            String S = sc.next();
            int count0 = 0;
            int count1 = 0;
            for(char c : S.toCharArray()){
                if(c =='0'){
                    count0++;
                }else{
                    count1++;
                }
            }
            int minValue = Math.min(count0,count1);
            int maxValue = Math.max(count0,count1);

            if(count0 == count1){
                System.out.println(count0+count1);
            }else{
                System.out.println(2*minValue+1);
            }
        }

    }
}
