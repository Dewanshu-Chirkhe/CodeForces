import java.io.*;
import java.util.*;

public class excitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(b > a){
                long temp = a;
                a = b;
                b = temp;
            }

            if(a == b) System.out.println("0 0");
            else{
                long d = Math.abs(a - b);
                long moves = Math.min(a % d, d - (a % d));
                System.out.println(d+" "+moves);
            }
        }
        sc.close();
    }
}