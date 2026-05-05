import java.util.*;

public class SkiResort_1840C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();

            long[][] arr = new long[(int)n][2];
            long len = 0;
            long ans = 0;

            for(int i=0 ; i<n ; i++){
                arr[i][0] = sc.nextLong();
                if(arr[i][0] <= q) len++;
                else{
                    if(len >= k){
                        long x = len - k + 1;
                        ans += (x * (x + 1)) / 2;
                    }
                    len = 0;
                }
            }

            if(len >= k){
                long x = len - k + 1;
                ans += (x * (x + 1)) / 2;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
