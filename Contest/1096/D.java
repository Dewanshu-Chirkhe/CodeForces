import java.io.*;
import java.util.*;

public class D {
    static int n;
    static int[] arr;
    public static int solve(int left, int right){
        boolean[] used = new boolean[n+2];

        while(left >= 0 && right < 2*n && arr[left] == arr[right]){
            used[arr[left]] = true;
            left--;
            right++;
        }

        int ans = -1;
        for(int i=0 ; i<= n ; i++){
            if(!used[i]){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            arr = new int[2*n];
            int x = -1, y = -1;
            for(int i=0 ; i<2*n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 0){
                    if(x != -1) y = i;
                    else x = i;
                }
            }

            int ans = Math.max(solve(x, x), Math.max(solve(y, y), solve((x+y)/2, (x+y+1)/2)));

            System.out.println(ans);
        }
        sc.close();
    }
}