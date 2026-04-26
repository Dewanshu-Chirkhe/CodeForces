import java.io.*;
import java.util.*;

public class balancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            int maxLen = 1, curr = 1;
            for(int i=1 ; i<n ; i++){
                if(arr[i] - arr[i-1] <=k) curr++;
                else curr = 1;
                maxLen = Math.max(maxLen, curr);
            }

            System.out.println(n - maxLen);
        }
        sc.close();
    }
}