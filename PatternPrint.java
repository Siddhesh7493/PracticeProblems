import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int grid[][]=new int[N][N];
            int counter = 1;

            for(int s=0;s<=2*N-2;s++){
                for(int i=0;i<N;i++){
                    int j = s-i;
                    if((j>=0)&&(j<N)){
                        grid[i][j]=counter++;
                    }
                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    System.out.print(grid[i][j] + (j == N-1 ? "" :" "));
                }
                System.out.println();
            }
        }

    }
}