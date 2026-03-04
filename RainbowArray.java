import java.util.*;

public class RainbowArray
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){

            int N = sc.nextInt();
            int[] A = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            boolean isRainbow = true;

            if(N < 13) isRainbow = false;

            int left = 0, right = N - 1;
            int current = 1;

            while(left <= right){

                if(A[left] != A[right]){
                    isRainbow = false;
                    break;
                }

                if(A[left] < 1 || A[left] > 7){
                    isRainbow = false;
                    break;
                }

                if(A[left] == current){

                }
                else if(A[left] == current + 1){
                    current++;
                }
                else{
                    isRainbow = false;
                    break;
                }

                left++;
                right--;
            }

            if(current != 7) isRainbow = false;

            if(isRainbow)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}