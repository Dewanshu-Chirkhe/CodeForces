import java.io.*;
import java.util.*;

public class makeItIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }

            long ans = 0; 
			for (int i = n - 2; i >= 0; i--){ 
				while (a[i] >= a[i + 1]){ 
					ans++; 
					a[i] /= 2; 
					if (a[i] == 0){ 
						break;
					}
				}
				if (a[i] == 0 && a[i + 1] == 0){ 
					ans = -1; 
					break;
				}
			}
			System.out.println(ans);
        }
        sc.close();
    }
}