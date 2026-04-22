import java.util.*;

public class EuclideanGCDReduction
{
    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            int g = A[0];
            for(int i = 1; i < N; i++){
                g = gcd(g, A[i]);
            }

            if(g == 1){
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }

    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}