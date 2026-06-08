import java.util.*;

public class DifferentDivisors_1474B {
    static boolean[] isPrime = new boolean[50000 + 1];
    static void sieve(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2 ; i*i<= 50000 ; i++){
            if(isPrime[i]){
                for(int j=i*i ; j<= 50000 ; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
    static long nextPrime(int x){
        while(!isPrime[x]) x++;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sieve();

        int t = sc.nextInt();
        while(t-- > 0){
            long d = sc.nextLong();
            
            long p = nextPrime((int)(d + 1));
            long q = nextPrime((int)(p + d));

            System.out.println(p * q);
        }

        sc.close();
    }
}
