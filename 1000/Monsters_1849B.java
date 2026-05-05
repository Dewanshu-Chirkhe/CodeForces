import java.util.*;

public class Monsters_1849B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[][] arr = new long[(int)n][2];

            for(int i=0 ; i<n ; i++){
                long x = sc.nextLong();
                long val = x % k;
                if(val == 0) val = k;

                arr[i][0] = val;
                arr[i][1] = i + 1;
            }

            Arrays.sort(arr, (a, b) -> {
                if(a[0] != b[0]) return Long.compare(b[0], a[0]);
                return Long.compare(a[1], b[1]);
            });

            for(int i=0 ; i<n ; i++){
                System.out.print(arr[i][1]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
