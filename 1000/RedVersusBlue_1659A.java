import java.util.*;

public class RedVersusBlue_1659A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            
            int base = r / (b + 1);
            int extra = r % (b + 1);

            while(b > 0){
                for(int i=0 ; i<base ; i++){
                    sb.append('R');
                    r--;
                }
                if(extra > 0){
                    sb.append('R');
                    r--;
                    extra--;
                }
                sb.append('B');
                b--;
            }

            while(r > 0){
                sb.append('R');
                r--;
            }

            System.out.println(sb);

        }

        sc.close();
    }
}
