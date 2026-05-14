import java.util.*;

public class MinimumLcm_1765M {
    // public static int LCM(int a, int b) {
    //     int gcd = GCD(a, b);
    //     return (a * b) / gcd;
    // }

    // public static int GCD(int a, int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            if(n % 2 == 0){
                System.out.println(n/2+" "+n/2);
            }
            else{
                int d = n;

                for(int i=3 ; i*i <= n ; i++){
                    if(n % i == 0){
                        d = i;
                        break;
                    }
                }

                int a = n / d;
                int b = n - a;

                System.out.println(a+" "+b);
            }

            // int A = 1, B = 1;
            // int minLCM = Integer.MAX_VALUE;

            // for(int i=1 ; i<(n/2)+1 ; i++){
            //     int a = i;
            //     int b = n-i;

            //     int lcm = LCM(a, b);
            //     if(lcm < minLCM){
            //         minLCM = lcm;
            //         A = a;
            //         B = b;
            //     }
            // }

            // System.out.println(A+" "+B);
        }
        sc.close();
    }
}
