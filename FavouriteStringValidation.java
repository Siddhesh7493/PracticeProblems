import java.util.*;
import java.io.*;

public class FavouriteStringValidation
{
    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int N = sc.nextInt();
            String S = sc.next();

            boolean foundCode = false;
            boolean valid = true;

            for(int i = 0; i <= N - 4; i++){

                String sub = S.substring(i, i + 4);

                if(sub.equals("code")){
                    foundCode = true;
                }

                if(sub.equals("chef")){
                    if(!foundCode){
                        valid = false;
                        break;
                    }
                }
            }

            if(valid){
                System.out.println("AC");
            } else {
                System.out.println("WA");
            }
        }
    }
}