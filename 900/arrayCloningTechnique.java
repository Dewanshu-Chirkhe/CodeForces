import java.io.*;
import java.util.*;

public class arrayCloningTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            Map<Integer, Integer> map = new HashMap<>();
            int highestFreq = 0;
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                highestFreq = Math.max(highestFreq, map.get(arr[i]));
            }

            int operations = 0;
            while(highestFreq < n){
                operations++;
                if(highestFreq * 2 <= n){
                    operations += highestFreq;
                    highestFreq *= 2;
                }
                else{
                    operations += n - highestFreq;
                    highestFreq = n;
                }
            }

            System.out.println(operations);
        }
        sc.close();
    }
}