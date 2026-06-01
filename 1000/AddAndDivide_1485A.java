import java.util.*;

public class AddAndDivide_1485A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = Integer.MAX_VALUE;
            for(int add=0 ; add<=32 ; add++){
                int ops = add;
                int dividend = a;
                int divisor = b + add;

                if(divisor == 1){
                    divisor++;
                    ops++;
                }

                while(dividend != 0){
                    ops++;
                    dividend = Math.floorDiv(dividend, divisor);
                }

                ans = Math.min(ans, ops);
            }
            
            System.out.println(ans);
        }

        sc.close();
    }
}
