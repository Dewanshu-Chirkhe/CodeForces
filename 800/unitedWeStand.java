import java.io.*;
import java.util.*;

public class unitedWeStand {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int minEle = Integer.MAX_VALUE;
            for(int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
                minEle = Math.min(minEle, a[i]);
            }

            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                int ele = a[i];
                if(ele == minEle) b.add(ele);
                else c.add(ele);
            }

            if(b.size() == 0 || c.size() == 0){
                System.out.println("-1");
            }
            else{
                System.out.println(b.size()+" "+c.size());
                for(int ele : b){
                    System.out.print(ele+" ");
                }
                System.out.println();
                for(int ele : c){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}