import java.io.*;
import java.util.*;

public class everybodyLikesGoodArray {
    public static boolean isGood(List<Integer> list){
        int n = list.size();
        for(int i=0 ; i<n-1 ; i++){
            int curr = list.get(i);
            int next = list.get(i+1);
            if((curr % 2 == 0 && next % 2 == 0) || (curr % 2 != 0 && next % 2 != 0))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                list.add(sc.nextInt());
            }

            int operations = 0;
            while(!isGood(list)){
                operations++;
                
            }

            System.out.println(operations);
        }
        sc.close();
    }
}