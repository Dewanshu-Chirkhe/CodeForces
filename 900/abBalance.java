import java.io.*;
import java.util.*;

public class abBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();

            int ab = 0;
            int ba = 0;
            for(int i=0 ; i<n-1 ; i++){
                char curr = s.charAt(i);
                char next = s.charAt(i+1);
                if(curr == 'a' && next == 'b') ab++;
                else if(curr == 'b' && next == 'a') ba++;
            }

            if(ab == ba) System.out.println(s);
            else{
                char[] arr = s.toCharArray();
                arr[0] = arr[n-1];
                System.out.println(new String(arr));
            }
        }
        sc.close();
    }
}