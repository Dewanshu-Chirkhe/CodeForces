import java.io.*;
import java.util.*;

public class twoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a + b + 2 <= n || (a == b && a == n)){
				System.out.println("Yes"); 
			} 
            else{
				System.out.println("No"); 
			}
        }
        sc.close();
    }
}