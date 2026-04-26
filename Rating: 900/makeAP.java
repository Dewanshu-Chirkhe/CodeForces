import java.io.*;
import java.util.*;

public class makeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean answer = false; 

			long new_a = 2 * b - c; 
			if(new_a / a > 0 && new_a % a == 0) answer = true;

			long new_b = (a + c) / 2; 
			if(new_b / b > 0 && new_b % b == 0 && (c - a) % 2 == 0) answer = true;

			long new_c = 2 * b - a; 
			if(new_c / c > 0 && new_c % c == 0) answer = true;

			if(answer) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}