import java.io.*;
import java.util.*;

public class permutationSwap {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            int k=0;
            for(int i=0 ; i<n ; i++){
                int diff = Math.abs(arr[i] - (i+1));
                k = gcd(k, diff);
            }

            System.out.println(k);
        }
        sc.close();
    }
}