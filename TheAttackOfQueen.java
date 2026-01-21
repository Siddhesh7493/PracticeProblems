import java.util.*;
import java.lang.*;
import java.io.*;

public class TheAttackOfQueen
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while(T-- > 0){
                int N = sc.nextInt();
                int X = sc.nextInt();
                int Y = sc.nextInt();

                int rowColumn = 2 * (N - 1);

                int topLeft = Math.min(X - 1, Y - 1);
                int topRight = Math.min(X - 1, N - Y);
                int bottomLeft = Math.min(N - X, Y - 1);
                int bottomRight = Math.min(N - X, N - Y);

                int Diagonals = topLeft + topRight + bottomLeft + bottomRight;

                System.out.println(rowColumn + Diagonals);
            }
        }
    }
}