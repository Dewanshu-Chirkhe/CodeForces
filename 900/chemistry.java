import java.io.*;
import java.util.*;

public class chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            if(n <= 1){
                System.out.println("YES");
                continue;
            }

            Map<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int oddCount = 0;
            for(int values : map.values()){
                if(values % 2 != 0) oddCount++;
            }

            if(oddCount - 1 <= k) System.out.println("YES");
            else System.out.println("NO");
            
        }
        sc.close();
    }
}