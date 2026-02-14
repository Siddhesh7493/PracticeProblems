import java.util.Scanner;

public class HouseRobber {
    public static int rob(int[] houses){
        int prev2=0;
        int prev1=0;

        for(int num:houses){
            int current=Math.max(prev1,prev2+num);
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Testcases are there:");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println("How many houses are there:");
            int N = sc.nextInt();
            int[] houses = new int[N];
            for(int i=0;i<N;i++){
                houses[i]=sc.nextInt();
            }
            System.out.println(rob(houses));
        }
    }
}
