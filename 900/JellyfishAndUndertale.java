import java.io.*;
import java.util.*;

public class JellyfishAndUndertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
            long[] times = new long[n];

            long maxTime = b;
            for(int i=0 ; i<n ; i++){
                times[i] = sc.nextInt();
                maxTime += Math.min(times[i], a-1);
            }
            
            System.out.println(maxTime);
        }
        sc.close();
    }
}