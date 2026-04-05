import java.util.*;

public class MaxTableStrength
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int weight[] = new int[N];

            for(int i = 0; i < N; i++){
                weight[i] = sc.nextInt();
            }

            Arrays.sort(weight);

            int max = 0;

            for(int i = 0; i < N; i++){
                int k = N - i;
                int minStrength = weight[i];

                int possible = k * minStrength;

                if(possible > max){
                    max = possible;
                }
            }

            System.out.println(max);
        }
    }
}