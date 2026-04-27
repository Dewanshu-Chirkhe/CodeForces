import java.io.*;
import java.util.*;

public class oddQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            long[] prefix = new long[n+1];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                prefix[i+1] = arr[i] + prefix[i];
            }
            
            long totalSum = prefix[n];

            while(q-- > 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                long rangeSum = prefix[r] - prefix[l-1];
                long changeSum = (r-l+1) * k;
                long newSum = totalSum - rangeSum + changeSum;

                if(newSum % 2 != 0) System.out.println("YES");
                else System.out.println("NO");
            }

        }
        sc.close();
    }
}