import java.io.*;
import java.util.*;

public class comparisonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int len = 1, maxLen = 1;
            char curr = s.charAt(0);
            for(int i=1 ; i<s.length() ; i++){
                char ch = s.charAt(i);
                if(ch == curr) len++;
                else{
                    curr = ch;
                    len = 1;
                }
                maxLen = Math.max(maxLen, len);
            }

            System.out.println(maxLen+1);
        }
        sc.close();
    }
}