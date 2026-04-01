import java.util.Scanner;

public class AlternateCharactersFromTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i<str1.length()||i<str2.length()){
            if(i<str1.length()){
                sb.append(str1.charAt(i));
            }
            if(i<str2.length()) {
                sb.append(str2.charAt(i));
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}
