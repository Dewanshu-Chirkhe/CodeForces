import java.util.*;

public class BuyingTorches_1418A {
    private static long ceilDivision(long a, long b) {
		return (a + b - 1) / b;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long sticksGainedPerTrade = x - 1; 
            long sticksNeeded = k * y + k - 1;

			long trades = 0;
			trades += ceilDivision(sticksNeeded, sticksGainedPerTrade);
			trades += k;

			System.out.println(trades);            
        }

        sc.close();
    }
}
