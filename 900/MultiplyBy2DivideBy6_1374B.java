import java.util.*;

public class MultiplyBy2DivideBy6_1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            
            long countOf2 = 0;
            long countOf3 = 0;

            while(n > 0 && n % 3 == 0){
                countOf3++;
                n /= 3;
            }
            while(n > 0 && n % 2 == 0){
                countOf2++;
                n /= 2;
            }

            if(n > 1 || countOf2 > countOf3) System.out.println(-1);
            else System.out.println(countOf3 + (countOf3 - countOf2));
        }
        sc.close();
    }
}
