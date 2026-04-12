import java.util.*;

public class MatrixCornerMatchSquares
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            char[][] arr = new char[N][M];

            for(int i=0;i<N;i++){
                String s = sc.next();
                for(int j=0;j<M;j++){
                    arr[i][j] = s.charAt(j);
                }
            }

            int count = 0;

            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){

                    for(int k=1; i+k < N && j+k < M; k++){

                        if(arr[i][j] == arr[i][j+k] &&
                                arr[i][j] == arr[i+k][j] &&
                                arr[i][j] == arr[i+k][j+k]){
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}