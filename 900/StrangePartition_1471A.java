import java.util.*;

public class StrangePartition_1471A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextLong();
            }
            
            long max = 0, min = 0;
            for(int i=0 ; i<n ; i++){
                max += Math.ceilDiv(arr[i], x);
                min += arr[i];
            }
            min = Math.ceilDiv(min, x);

            System.out.println(min+" "+max);
        }
        sc.close();
    }
}
