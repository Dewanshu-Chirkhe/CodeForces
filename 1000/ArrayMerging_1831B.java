import java.util.*;

public class ArrayMerging_1831B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();

            int[] mapA = new int[2 * n + 1];
            int[] mapB = new int[2 * n + 1];

            int count = 1;

            for(int i = 1; i <= n; i++) {
                if(i < n && a[i] == a[i - 1]) count++;
                else {
                    mapA[a[i - 1]] = Math.max(mapA[a[i - 1]], count);
                    count = 1;
                }
            }

            count = 1;

            for(int i = 1; i <= n; i++) {
                if(i < n && b[i] == b[i - 1]) count++;
                else {
                    mapB[b[i - 1]] = Math.max(mapB[b[i - 1]], count);
                    count = 1;
                }
            }

            int ans = 0;

            for(int i = 1; i <= 2 * n; i++) {
                ans = Math.max(ans, mapA[i] + mapB[i]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}