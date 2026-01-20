import java.util.*;
        import java.lang.*;
        import java.io.*;

public class ChefAndLockoutDraws
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int[] points = new int[3];
            for(int i=0;i<3;i++){
                points[i]=sc.nextInt();
            }
            Arrays.sort(points);
            int pointsAB = points[0]+points[1];
            int C = points[2];
            if(pointsAB == C){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
