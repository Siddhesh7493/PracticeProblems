import java.util.Scanner;

public class GcdLcmUtility {
    static long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    static long lcm(long a,long b){
        long lcmans=(a*b)/gcd(a,b);
        return lcmans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long g = gcd(a,b);
        long l = lcm(a,b);

        System.out.print("GCD:"+ g + " and LCM:"+l);
    }
}
