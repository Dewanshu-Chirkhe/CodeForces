import java.util.*;

public class ThreeIndices_1380A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            boolean exist = false;
            int i=0, j=1, k=2;
            while(j <= n-2){
                int left = j-1;
                while(left >= 0 && arr[left] >= arr[j]) left--;
                
                int right = j+1;
                while(right < n && arr[right] >= arr[j]) right++;
                
                if(left < 0 || right >= n) j++;
                else{
                    exist = true;
                    i = left;
                    k = right;
                    break;
                }
            }

            if(exist){
                System.out.println("YES");
                System.out.println((i+1)+" "+(j+1)+" "+(k+1));
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
