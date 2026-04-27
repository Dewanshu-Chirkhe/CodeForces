import java.io.*;
import java.util.*;

public class luntikAndSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int countZero = 0, countOne = 0;
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1) countOne++;
                else if(arr[i] == 0) countZero++;
            }

            long ans = (long)Math.pow(2, countZero) * countOne;
            System.out.println(ans);
        }
        sc.close();
    }
}