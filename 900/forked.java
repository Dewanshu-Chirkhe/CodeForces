import java.io.*;
import java.util.*;

public class forked {
    public static Set<String> getPositions(int x, int y, int a, int b){
        Set<String> set = new HashSet<>();
        int[][] moves = {
            {a, b}, {a, -b}, {-a, b}, {-a, -b},
            {b, a}, {b, -a}, {-b, a}, {-b, -a}
        };

        for(int[] move : moves){
            int nx = x + move[0];
            int ny = y + move[1];
            set.add(nx + "," + ny);
        }

        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int xk = sc.nextInt();
            int yk = sc.nextInt();

            int xq = sc.nextInt();
            int yq = sc.nextInt();

            Set<String> kingSet = getPositions(xk, yk, a, b);
            Set<String> queenSet = getPositions(xq, yq, a, b);

            int count = 0;
            for(String pos : kingSet){
                if(queenSet.contains(pos)) count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}