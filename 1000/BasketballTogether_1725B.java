import java.util.*;

public class BasketballTogether_1725B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] p = new int[n];
        for(int i=0 ; i<n ; i++){
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int wins = 0;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int strongest = p[right];
            int nedded = (d / strongest) + 1;

            if(right - left + 1 >= nedded){
                wins++;
                left += nedded - 1;
                right--;
            }
            else break;
        }

        System.out.println(wins);

        sc.close();
    }
}
