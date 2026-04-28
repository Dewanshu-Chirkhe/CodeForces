import java.util.*;

public class SumOfMedians_1440B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n*k];
            for(int i=0 ; i<n*k ; i++){
                arr[i] = sc.nextInt();
            }

            long idx = n*k;
            long sum = 0;
            while(k-- > 0){
                idx -= (n/2+1);
                sum += (arr[(int)idx]);
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
