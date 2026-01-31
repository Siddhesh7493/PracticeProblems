import java.util.Scanner;

public class Factorial {
    static long factorial(int N){
        if(N==0 || N==1) return 1;
        else return N*factorial(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            //1.Iterative Way
            long fact = 1;
            for(int i=1;i<=N;i++){
                fact*=i;
            }
            System.out.println(fact  + " By Iterative Way");

            //2.Recursive Way
            System.out.println(factorial(N)  + "  By Recursive Way");
    }


    }
}
