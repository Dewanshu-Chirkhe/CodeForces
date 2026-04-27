import java.io.*;
import java.util.*;

public class ambitiousKid {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minValue = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            int ele = sc.nextInt();
            minValue = Math.min(minValue, Math.abs(ele));
        }
        System.out.println(minValue);
        sc.close();
    }
}