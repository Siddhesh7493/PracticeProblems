import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringCharacterCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c:Str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        int counter=0;
        for (char c : map.keySet()) {
            sb.append(map.get(c));
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
