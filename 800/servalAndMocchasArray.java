import java.io.*;
import java.util.*;

public class servalAndMocchasArray {
    public static long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextLong();
            }

            boolean isBeautifull = false;
            for(int i=0 ; i<n ; i++){
                for(int j=i+1 ; j<n ;j++){
                    if(gcd(arr[i], arr[j]) <= 2) isBeautifull = true;
                }
            }

            if(!isBeautifull) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}