import java.util.*;

public class LukeIsAFoodie_1704B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0 ; i<n ; i++) arr[i] = sc.nextLong();

            long[][] segments = new long[n][2];
            for(int i=0 ; i<n ; i++){
                segments[i][0] = arr[i] - x;
                segments[i][1] = arr[i] + x;
            }

            long l = segments[0][0];
            long r = segments[0][1];

            long ans = 0;

            for(int i=1 ; i<n ; i++){
                l = Math.max(l, arr[i] - x);
                r = Math.min(r, arr[i] + x);

                if(l > r){
                    ans++;
                    l = segments[i][0];
                    r = segments[i][1];
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
