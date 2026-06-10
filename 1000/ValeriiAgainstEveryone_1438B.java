import java.util.*;

public class ValeriiAgainstEveryone_1438B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long[] b = new long[n];
            Set<Long> set = new HashSet<>();
            for(int i=0 ; i<n ; i++){
                b[i] = sc.nextLong();
                set.add(b[i]);
            }

            if(set.size() < n) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
