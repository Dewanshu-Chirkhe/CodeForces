import java.io.*;
import java.util.*;

public class prependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            int left = 0, right = n-1;
            while(left < right){
                char c1 = s.charAt(left);
                char c2 = s.charAt(right);
                if((c1 == '1' && c2 == '0') || (c1 == '0' && c2 == '1')){
                    left++;
                    right--;
                } 
                else break;
            }
            System.out.println(right - left + 1);
        }
        sc.close();
    }
}