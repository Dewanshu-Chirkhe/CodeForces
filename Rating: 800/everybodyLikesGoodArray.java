import java.io.*;
import java.util.*;

public class everybodyLikesGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int operations = 0;

            for(int i = 0; i < n - 1; i++){
                if(arr[i] % 2 == arr[i+1] % 2){
                    operations++;
                }
            }

            System.out.println(operations);
        }
        sc.close();
    }
}