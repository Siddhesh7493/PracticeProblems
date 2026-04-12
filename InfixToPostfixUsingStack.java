import java.util.*;

public class InfixToPostfixUsingStack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            Stack<Character> stk = new Stack<>();

            for(char c : str.toCharArray()){

                if(c == '('){
                    continue;
                }
                else if(Character.isLetter(c)){
                    sb.append(c);
                }
                else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
                    stk.push(c);
                }
                else if(c == ')'){
                    sb.append(stk.pop());
                }
            }

            System.out.println(sb.toString());
        }
    }
}