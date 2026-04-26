import java.io.*;
import java.util.*;

public class deletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            String s = sc.next();
            String t = sc.next();

            int n = s.length();
            int m = t.length();
            int[] freqT = new int[26];
            for(int i=0 ; i<m ; i++){
                freqT[t.charAt(i) - 'A']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=n-1 ; i>=0 ; i--){
                if(freqT[s.charAt(i) - 'A'] > 0){
                    freqT[s.charAt(i) - 'A']--;
                    sb.append(s.charAt(i));
                }
            }

            sb.reverse();

            if(sb.toString().equals(t)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}