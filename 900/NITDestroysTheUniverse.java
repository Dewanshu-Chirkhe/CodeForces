import java.io.*;
import java.util.*;

public class NITDestroysTheUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            boolean sameSegment = false;
            for(int i=0 ; i<n ; i++){
                if(arr[i] != 0){
                    if(sameSegment) continue;
                    else{
                        ans++;
                        sameSegment = true;
                    }
                }
                else sameSegment = false;
            }

            if(ans == 0) System.out.println(0);
            else if(ans == 1) System.out.println(1);
            else System.out.println(2);
        }
        sc.close();
    }
}