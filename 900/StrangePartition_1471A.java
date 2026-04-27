import java.util.*;

public class StrangePartition_1471A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            
            int sum = 0;
            int div = 0;
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
                div += Math.ceilDiv(arr[i], x);
            }
            
            sum /= x;
            
            int min = Math.min(sum, div);
            int max = Math.max(sum, div);

            System.out.println(min+" "+max);
        }
        sc.close();
    }
}
