import java.io.*;
import java.util.*;

public class makeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Set<Integer> set = new HashSet<>();
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }

            int[] prefix = new int[n];
            prefix[0] = arr[0];
            for(int i=1 ; i<n ; i++){
                prefix[i] = arr[i] + prefix[i-1];
            }
            
            if(set.size() == 1) System.out.print("NO");
            else{
                System.out.println("YES");
                System.out.print(arr[0]+" ");
                for(int i=1 ; i<n-1 ; i++){
                    if(arr[i+1] == prefix[i]){
                        int temp = arr[i+1];
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                    }
                    System.out.print(arr[i]+" ");
                }
                System.out.print(arr[n-1]);
            }

            System.out.println();
        }
        sc.close();
    }
}