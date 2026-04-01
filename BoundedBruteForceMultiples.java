import java.util.*;

public class BoundedBruteForceMultiples
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long N = sc.nextLong();

            long i = ((N + A - 1) / A) * A;

            boolean found = false;

            for(int step = 0; step < 100; step++){
                if(i % B != 0){
                    System.out.println(i);
                    found = true;
                    break;
                }
                i += A;
            }

            if(!found){
                System.out.println(-1);
            }
        }
    }
}