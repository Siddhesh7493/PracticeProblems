import java.util.Scanner;

public class Palindrome {
    static void checkPalindrome(int N){
        int original = N;
        int reversed = 0;
        while(N > 0){
            int lastDigit = N%10;
            reversed=(reversed*10)+lastDigit;
            N=N/10;
        }
        System.out.println(reversed);
        if(original == reversed){
            System.out.printf("Given number %d is Palindrome!",original);
        }else {
            System.out.printf("Given number %d is not Palindrome!", original);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        checkPalindrome(N);
    }
}
