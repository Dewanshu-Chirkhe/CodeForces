import java.util.*;

public class TrianglesOnARectangle_1620B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long w = sc.nextLong();
            long h = sc.nextLong();

            long ans = 0;

            for(int i=0 ; i<4 ; i++){
                int k = sc.nextInt();

                long first = sc.nextLong();
                long last = first;
                for(int j=1 ; j<k ; j++){
                    last = sc.nextLong();
                }

                long base = last - first;
                if(i < 2) ans = Math.max(ans, base * h);
                else ans = Math.max(ans, base * w);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
