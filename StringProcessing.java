import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            String S = sc.next();
            int sum=0;
            for(char c : S.toCharArray()){
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }
            System.out.println(sum);
        }
    }
}
