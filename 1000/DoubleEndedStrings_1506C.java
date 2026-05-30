import java.util.*;

public class DoubleEndedStrings_1506C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int n = a.length();
            int m = b.length();
            int[][] dp = new int[n+1][m+1];

            int maxLCS = 0; 

            for(int i=1 ; i<=n ; i++){
                char chA = a.charAt(i-1);
                for(int j=1 ; j<=m ; j++){
                    char chB = b.charAt(j-1);
                    if(chA == chB) dp[i][j] = 1 + dp[i-1][j-1];
                    else dp[i][j] = 0;
                    maxLCS = Math.max(maxLCS, dp[i][j]);
                }
            }

            if(maxLCS == 0) System.out.println(n + m);
            else System.out.println((m + n) - (2 * maxLCS));
        }

        sc.close();
    }
}
