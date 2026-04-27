import java.io.*;
import java.util.*;

public class notDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0 ; i<n ; i++){
                if(arr[i] == 1) arr[i] = 2;
            }

            for(int i=0 ; i<n-1 ; i++){
                if(arr[i+1] % arr[i] == 0) arr[i+1]++;
            }

            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}