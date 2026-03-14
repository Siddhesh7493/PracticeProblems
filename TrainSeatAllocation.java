import java.util.*;

public class TrainSeatAllocation
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int[][] comp = {
                {1,2,3,4,53,54},
                {5,6,7,8,51,52},
                {9,10,11,12,49,50},
                {13,14,15,16,47,48},
                {17,18,19,20,45,46},
                {21,22,23,24,43,44},
                {25,26,27,28,41,42},
                {29,30,31,32,39,40},
                {33,34,35,36,37,38}
        };

        int ans = 0;

        for(int i=0;i<N;i++)
        {
            String seats = sc.next();

            for(int c=0;c<9;c++)
            {
                int count = 0;

                for(int k=0;k<6;k++)
                {
                    if(seats.charAt(comp[c][k]-1)=='0')
                        count++;
                }

                ans += combination(count,X);
            }
        }

        System.out.println(ans);
    }

    static int combination(int n,int r)
    {
        if(r>n) return 0;

        int facto = fact(n);
        int factoX = fact(r);
        int factoComb = fact(n-r);

        return facto/(factoX*factoComb);
    }

    static int fact(int num)
    {
        if(num==0 || num==1)
            return 1;

        return num*fact(num-1);
    }
}