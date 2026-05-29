import java.util.*;

public class MexorMixup_1567B {
    public static long xorTill(long n){
        if(n % 4 == 0) return n;
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            long xor = xorTill(a - 1);
            
            if(xor == b) System.out.println(a);
            else{
                long need = xor ^ b;
                if(need == a) System.out.println(a + 2);
                else System.out.println(a + 1);
            }
        }

        sc.close();
    }
}
