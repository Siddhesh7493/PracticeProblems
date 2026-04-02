import java.util.*;

public class Subanagrams
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Character, Integer> minMap = new HashMap<>();

        String first = sc.next();
        for(char c : first.toCharArray()){
            minMap.put(c, minMap.getOrDefault(c, 0) + 1);
        }

        for(int i = 1; i < N; i++){
            String str = sc.next();

            HashMap<Character, Integer> tempMap = new HashMap<>();

            for(char c : str.toCharArray()){
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }

            for(char ch : new HashSet<>(minMap.keySet())){
                if(tempMap.containsKey(ch)){
                    minMap.put(ch, Math.min(minMap.get(ch), tempMap.get(ch)));
                } else {
                    minMap.remove(ch);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        ArrayList<Character> keys = new ArrayList<>(minMap.keySet());
        Collections.sort(keys);

        for(char ch : keys){
            int freq = minMap.get(ch);
            while(freq-- > 0){
                result.append(ch);
            }
        }

        if(result.length() == 0){
            System.out.println("no such string");
        } else {
            System.out.println(result.toString());
        }
    }
}