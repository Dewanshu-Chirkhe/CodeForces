import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int left = 0, right = 0;
            for(char ch : s.toCharArray()){
                if(ch == '(') left++;
                else right++;
            }

            if(left == right) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}