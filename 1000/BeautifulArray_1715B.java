import java.util.*;

public class BeautifulArray_1715B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long minimum = k * b;
            long maximum = (k * b) + (k - 1) * n;

            if(s < minimum || s > maximum){
                System.out.println(-1);
            }
            else{
                long[] ans = new long[(int)n];
                ans[0] = minimum;
                s -= minimum;

                for(int i=0 ; i<n ; i++){
                    long add = Math.min(k-1, s);
                    ans[i] += add;
                    s -= add;
                }

                for(long ele : ans){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
