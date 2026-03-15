import java.io.*;
import java.util.*;

public class oneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long totalTwos = 0;
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextLong();
                if(arr[i] == 2) totalTwos++;
            }

            long currTwos = 0;
            int ans = -1;
            for(int i=0 ; i<n-1 ; i++){
                if(arr[i] == 2){
                    currTwos++;
                }
                if(currTwos == (totalTwos - currTwos)){
                    ans = i+1;
                    break;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}