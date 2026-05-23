import java.util.*;

public class BlackAndWhiteStripe_1690D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] prefix = new int[n+1];
            for(int i=0 ; i<n ; i++){
                prefix[i+1] = prefix[i] + (s.charAt(i) == 'W' ? 1 : 0);
            }

            int minChanges = Integer.MAX_VALUE;
            for(int i=0 ; i<=n-k ; i++){
                int diff = prefix[i+k] - prefix[i];
                minChanges = Math.min(minChanges, diff);
            }

            System.out.println(minChanges);
        }

        sc.close();
    }
}
