import java.util.*;

public class FairNumbers_1411B {
    public static boolean isFair(long num){
        long n = num;
        while(n != 0){
            int rem = (int)(n % 10);
            if(rem != 0 && num % rem != 0) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();

            long min = n;
            while(!isFair(min)){
                min++;
            }

            System.out.println(min);
        }

        sc.close();
    }
}
