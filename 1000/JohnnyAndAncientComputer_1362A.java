import java.util.*;

public class JohnnyAndAncientComputer_1362A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            long big = Math.max(a, b);
            long small = Math.min(a, b);

            int steps = 0;

            while (big > small) {
                if (big % 8 == 0 && big / 8 >= small) {
                    big /= 8;
                    steps++;
                } else if (big % 4 == 0 && big / 4 >= small) {
                    big /= 4;
                    steps++;
                } else if (big % 2 == 0 && big / 2 >= small) {
                    big /= 2;
                    steps++;
                } else {
                    break;
                }
            }

            System.out.println(big == small ? steps : -1);
        }

        sc.close();
    }
}
