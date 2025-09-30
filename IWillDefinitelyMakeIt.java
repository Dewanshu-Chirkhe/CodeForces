import java.io.FileInputStream;
import java.util.*;

public class IWillDefinitelyMakeIt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt() - 1; // convert to 0-based index
            int[] h = new int[n];
            for (int i = 0; i < n; i++) h[i] = sc.nextInt();

            int startHeight = h[p];
            int maxHeight = h[0];
            for (int i = 1; i < n; i++) {
                if (h[i] > maxHeight) maxHeight = h[i];
            }

            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) indices[i] = i;

            Arrays.sort(indices, (i, j) -> h[i] - h[j]);

            long budget = startHeight;
            int currentHeight = startHeight;
            boolean possible = false;

            for (int i : indices) {
                if (h[i] < currentHeight) continue;
                long cost = h[i] - currentHeight;
                if (cost > budget) break;
                budget -= cost;
                currentHeight = h[i];
                if (currentHeight == maxHeight) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
