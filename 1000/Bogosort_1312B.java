import java.util.*;

public class Bogosort_1312B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr, (a, b) -> Integer.compare(b, a));

            for(int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
