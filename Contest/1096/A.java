import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x % 2 == 0 || y % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}