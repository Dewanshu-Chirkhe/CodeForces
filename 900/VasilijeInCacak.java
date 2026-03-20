import java.io.*;
import java.util.*;

public class VasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long minSum = (k * (k + 1)) / 2;
            long maxSum = 0;
            while(k != 0){
                maxSum += n;
                n--;
                k--;
            }

            if(x >= minSum && x <= maxSum) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}