import java.io.*;
import java.util.*;

public class makeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); 
			long maxNumber = arr[n - 1];
			long minNumber = arr[0]; 
			if (maxNumber == minNumber) { 
				System.out.println("NO"); 
			} else {
				System.out.println("YES"); 
				System.out.print(maxNumber + " "); 
				for (int i = 0; i < n - 1; i++) {
					System.out.print(arr[i] + " "); 
				}
				System.out.println(); 
			}
        }
        sc.close();
    }
}