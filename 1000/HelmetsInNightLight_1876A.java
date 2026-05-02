import java.util.*;

public class HelmetsInNightLight_1876A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long p = sc.nextLong();
            long[] maxShare = new long[n];
            long[] cost = new long[n];
            for(int i=0 ; i<n ; i++) maxShare[i] = sc.nextLong();
            for(int i=0 ; i<n ; i++) cost[i] = sc.nextLong();
            
            List<Pair> list = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                Pair pair = new Pair(cost[i], maxShare[i]);
                list.add(pair);
            }

            Collections.sort(list, (a, b) -> Long.compare(a.cost, b.cost));

            long minCost = p;
            long shared = 1;

            for(Pair pair : list){
                long canShare = pair.maxShare;
                long sharingCost = pair.cost;

                if(sharingCost >= p) break;

                if(shared + canShare > n){
                    minCost += (n - shared) * sharingCost;
                    shared = n;
                    break;
                }
                else{
                    minCost += canShare * sharingCost;
                    shared += canShare;
                }
            }

            minCost += (n - shared) * p;
            System.out.println(minCost);
        }
        sc.close();
    }
}

class Pair{
    long cost;
    long maxShare;
    Pair(long cost, long maxShare){
        this.cost = cost;
        this.maxShare = maxShare;
    }
}