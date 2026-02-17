import java.util.*;
import java.lang.*;
import java.io.*;

 public class CheckLengthThenSubstring
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        String[] Karr = new String[K];
        for(int i=0; i<K; i++){
            Karr[i] = sc.next();
        }

        String[] Narr = new String[N];
        for(int i=0; i<N; i++){
            Narr[i] = sc.next();
        }

        for(int i=0; i<N; i++){
            if(Narr[i].length() >= 47){
                System.out.println("Good");
            }
            else {
                boolean found = false;
                for(int j=0; j<K; j++){
                    if(Narr[i].contains(Karr[j])){
                        found = true;
                        break;
                    }
                }

                if(found){
                    System.out.println("Good");
                } else {
                    System.out.println("Bad");
                }
            }
        }
    }
}