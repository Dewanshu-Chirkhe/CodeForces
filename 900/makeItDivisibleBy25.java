import java.io.*;
import java.util.*;

public class makeItDivisibleBy25 {
    public static int minOperations(String n, String possiblevalue){
        int operations = 0;
        int checkIndex = possiblevalue.length() - 1;

        for(int i=n.length()-1 ; i>=0 ; i--){
            if(n.charAt(i) == possiblevalue.charAt(checkIndex)){
                checkIndex--;
                if(checkIndex < 0) break;
            }
            else operations++;
        }

        return operations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String n = sc.next();

            List<String> possibleValues = Arrays.asList("00", "25", "50", "75");
            int ans = Integer.MAX_VALUE;
            for(String possiblevalue : possibleValues){
                ans = Math.min(ans, minOperations(n, possiblevalue));
            }

            System.out.println(ans);
        }
        sc.close();
    }
}