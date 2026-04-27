import java.io.*;
import java.util.*;

public class OddDivisor_1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            
            long mask = 1;
            boolean exists = false;
            for(int i=1 ; i<63 ; i++){
                mask = mask << 1;
                // System.out.println(mask);
                if(mask == n){
                    exists = true;
                    break;
                }
            }

            if(exists) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
