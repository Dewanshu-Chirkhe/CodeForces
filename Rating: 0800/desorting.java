import java.io.*;
import java.util.*;

public class desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            

            int operations = Integer.MAX_VALUE;
            for(int i=0 ; i<n-1 ; i++){
                if(arr[i] <= arr[i+1]){
                    int diff = arr[i+1] - arr[i];
                    int required_operations = diff / 2 + 1;
                    operations = Math.min(operations, required_operations);
                }
                else{
                    operations = 0;
                    break;
                }
            }
            System.out.println(operations);
        }
        sc.close();
    }
}