import java.util.*;

public class DistinctSplit_1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int[] leftDistinct = new int[n];
            int[] rightDistinct = new int[n];

            Set<Character> set = new HashSet<>();
            for(int i=0 ; i<n ; i++){
                set.add(s.charAt(i));
                leftDistinct[i] = set.size();
            }

            set.clear();
            for(int i=n-1 ; i>=0 ; i--){
                set.add(s.charAt(i));
                rightDistinct[i] = set.size();
            }

            int maxDistinct = Integer.MIN_VALUE;

            for(int i=0 ; i<n-1 ; i++){
                int split = leftDistinct[i] + rightDistinct[i+1];
                maxDistinct = Math.max(maxDistinct, split);
            }

            System.out.println(maxDistinct);
        }
        sc.close();
    }
}
