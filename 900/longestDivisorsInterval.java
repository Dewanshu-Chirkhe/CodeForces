import java.io.*;
import java.util.*;

public class longestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int ans = 1;
            while(n % ans == 0){
                ans++;
            }
            System.out.println(ans-1);
        }
        sc.close();
    }
}