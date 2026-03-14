import java.io.*;
import java.util.*;

public class weNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            
            int totalXOR = 0;
            for(int i=0 ; i<n ; i++){
                totalXOR ^= sc.nextInt();
            }

            if(n % 2 == 1) System.out.println(totalXOR);
            else{
                if(totalXOR == 0) System.out.println(totalXOR);
                else System.out.println("-1");
            }
        }
        sc.close();
    }
}