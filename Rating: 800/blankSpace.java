import java.io.*;
import java.util.*;

public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int consZeroes = 0;
            int count = 0;
            for(int i=0 ; i<n ; i++){
                int ele = sc.nextInt();
                if(ele == 0){
                    count++;
                    consZeroes = Math.max(consZeroes, count);
                }
                else count = 0;
            }

            System.out.println(consZeroes);
        }
        sc.close();
    }
}