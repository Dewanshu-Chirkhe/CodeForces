import java.io.*;
import java.util.*;

public class dontTryToCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            int operations = 0;
            while(!x.contains(s) && operations <= 6){
                x += x;
                operations++;
            }

            if(x.contains(s))
                System.out.println(operations);
            else
                System.out.println(-1);
        }
        sc.close();
    }
}