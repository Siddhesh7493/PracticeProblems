import java.util.*;

public class MaxProblemSets {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<4;i++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int maxFreq = 0;
            for(int i:map.values()){
                maxFreq=Math.max(i,maxFreq);
            }
            int ans=Math.min(2,4-maxFreq);
            System.out.println(ans);
        }
    }
}