import java.io.FileInputStream;
import java.util.*;

public class NoCasinoInTheMountains {
    public static void maxVisit(int n, int k, int[] arr) {
        int visit = 0;
        int rainyCount = 0;
        for (int i = 0; i < k && i < n; i++) {
            if (arr[i] == 1) rainyCount++;
        }
        int i = 0;
        while (i <= n - k) {
            if (rainyCount == 0) {
                visit++;
                i += k + 1;
                rainyCount = 0;
                for (int j = i; j < i + k && j < n; j++) {
                    if (arr[j] == 1) rainyCount++;
                }
            } else {
                if (arr[i] == 1) rainyCount--;
                if (i + k < n && arr[i + k] == 1) rainyCount++;
                i++;
            }
        }
        System.out.println(visit);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            maxVisit(n, k, arr);
        }
        sc.close();
    }
}
