
import java.util.*;
public class onlyOneDigit {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0){
            int x = sc.nextInt();
            int min = Integer.MAX_VALUE;
            while(x != 0){
                int rem = x % 10;
                x /= 10;
                min = Math.min(min, rem);
            }
            System.out.println(min);
            t--;
        }
        sc.close();
    }
}