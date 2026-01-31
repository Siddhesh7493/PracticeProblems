import java.util.Scanner;

public class Fibonnaci {
    static void fibonacciiter(int N){
        long first=0;
        long second=1;
        for(int i=0;i<N;i++){
            System.out.println(first);
            long next = first+second;
            first = second;
            second = next;
        }
    }
    static int fibonaccirecur(int N){
        if(N<=1) return N;
        return fibonaccirecur(N-2)+fibonaccirecur(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many fibonacci series you want:");
        int T = sc.nextInt();
        while(T-- > 0){
            System.out.println("Enter till what number you want series:");
            int N = sc.nextInt();
            System.out.println("Enter your choice 1 for iterative and 2 for recursive:");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Iterative Result:");
                fibonacciiter(N);
            }
            if(choice == 2){
                System.out.println("Recursive Result (Nth term only):");
                System.out.println(fibonaccirecur(N));
            }

        }
    }
}
