import java.io.*;
import java.util.*;

public class oddGrasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long n = sc.nextLong();

            long steps = n % 4;
            for(long i=n-steps+1 ; i<=n ; i++){
                if(x % 2 == 0){
                    x -= i;
                }
                else x += i;
            }

            System.out.println(x);
        }
        sc.close();
    }
}