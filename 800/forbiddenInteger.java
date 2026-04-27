import java.io.*;
import java.util.*;

public class forbiddenInteger {
    public static boolean backtrack(int n, int k, int x, List<Integer> list){
        if(n == 0) return true;

        for(int i=1 ; i<=k ; i++){
            if(i == x) continue;
            if(i > n) continue;
            list.add(i);
            if(backtrack(n-i, k, x, list)) return true;
            list.remove(list.size() - 1);
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            if(backtrack(n, k, x, list)){
                System.out.println("Yes");
                System.out.println(list.size());
                for(int ele : list){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
            else System.out.println("No");
        }
        sc.close();
    }
}