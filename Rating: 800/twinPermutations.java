import java.io.*;
import java.util.*;

public class twinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0 ; i<n ; i++){
                System.out.print((n + 1 - arr[i])+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}