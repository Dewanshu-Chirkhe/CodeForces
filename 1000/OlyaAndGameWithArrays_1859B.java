import java.util.*;

public class OlyaAndGameWithArrays_1859B {
    static class Triplet{
        long smallest;
        long secondSmallest;
        long maximum;
        Triplet(long smallest, long secondSmallest, long maximum){
            this.smallest = smallest;
            this.secondSmallest = secondSmallest;
            this.maximum = maximum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            long globalMin = Long.MAX_VALUE;
            List<Triplet> list = new ArrayList<>();

            for(int i=0 ; i<n ; i++){
                int m = sc.nextInt();

                long smallest = Long.MAX_VALUE;
                long secondSmallest = Long.MAX_VALUE;
                long maximum = Long.MIN_VALUE;
                long[] arr = new long[m];
                for(int j=0 ; j<m ; j++){
                    arr[j] = sc.nextLong();

                    globalMin = Math.min(globalMin, arr[j]);
                    maximum = Math.max(maximum, arr[j]);

                    if(arr[j] < smallest){
                        secondSmallest = smallest;
                        smallest = arr[j];
                    } else if(arr[j] < secondSmallest){
                        secondSmallest = arr[j];
                    }
                }

                Triplet p = new Triplet(smallest, secondSmallest, maximum);
                list.add(p);
            }

            long sumSecond = 0;
            long minSecond = Long.MAX_VALUE;

            for(Triplet trp : list){
                sumSecond += trp.secondSmallest;
                minSecond = Math.min(minSecond, trp.secondSmallest);
            }

            long maxBeauty = sumSecond - minSecond + globalMin;

            System.out.println(maxBeauty);
        }
        sc.close();
    }
}