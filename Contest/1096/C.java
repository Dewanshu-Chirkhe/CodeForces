import java.io.*;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            List<Integer> six = new ArrayList<>();
            List<Integer> two = new ArrayList<>();
            List<Integer> three = new ArrayList<>();
            List<Integer> other = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 6 == 0) six.add(arr[i]);
                else if(arr[i] % 2 == 0) two.add(arr[i]);
                else if(arr[i] % 3 == 0) three.add(arr[i]);
                else other.add(arr[i]);
            }

            StringBuilder sb = new StringBuilder();
            for (int x : six) sb.append(x).append(" ");
            for (int x : two) sb.append(x).append(" ");
            for (int x : other) sb.append(x).append(" ");
            for (int x : three) sb.append(x).append(" ");

            System.out.println(sb.toString());
        }
        sc.close();
    }
}