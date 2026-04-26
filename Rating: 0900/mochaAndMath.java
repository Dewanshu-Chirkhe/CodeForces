import java.io.*;
import java.util.*;

public class mochaAndMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextLong();
            }

            long totalAnd = arr[0];
            for(int i=1 ; i<n ; i++){
                totalAnd &= arr[i];
            }

            System.out.println(totalAnd);
        }
        sc.close();
    }
}