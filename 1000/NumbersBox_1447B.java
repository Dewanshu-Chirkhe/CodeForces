import java.util.*;

public class NumbersBox_1447B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[][] arr = new int[n][m];
            int neg = 0;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<m ; j++){
                    int ele = sc.nextInt();
                    arr[i][j] = ele;
                    sum += Math.abs(ele);
                    min = Math.min(min, Math.abs(ele));
                    if(ele < 0) neg++;
                }
            }

            if(neg % 2 == 0) System.out.println(Math.abs(sum));
            else System.out.println(Math.abs(sum) - (2 * min));
        }

        sc.close();
    }
}
