import java.io.*;
import java.util.*;

public class RoofConstruction_1632B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            int power = 1;
            while(power * 2 < n){
                power *= 2;
            }

            for(int i=power-1 ; i>=0 ; i--){
                list.add(i);
            }
            for(int i=power ; i<n ; i++){
                list.add(i);
            }

            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}