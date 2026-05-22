import java.util.*;

public class ShoeShuffling_1691B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0 ; i<n ; i++) arr[i] = sc.nextLong();

            long[] ans = new long[n];
            boolean possible = true;
            int i=0;

            while(i < n){
                int j = i;
                while(j < n && arr[j] == arr[i]){
                    j++;
                }

                int len = j - i;
                if(len == 1){
                    possible = false;
                    break;
                }

                for(int k = i; k<j-1; k++) ans[k] = k + 2;
                ans[j - 1] = i + 1;
                i = j;
            }

            if(!possible) System.out.println(-1);
            else{
                for(long ele : ans){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
