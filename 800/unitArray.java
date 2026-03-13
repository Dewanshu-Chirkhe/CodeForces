import java.io.*;
import java.util.*;

public class unitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int posOnes = 0;
            int negOnes = 0;
            for(int i=0 ; i<n ; i++){
                int num = sc.nextInt();
                if(num == 1) posOnes++;
                else negOnes++;
            }

            int diff = posOnes - negOnes;
            int operations = 0;
            while(diff < 0 || negOnes % 2 != 0){
                negOnes--;
                posOnes++;
                operations++;
                diff = posOnes - negOnes;
            }

            System.out.println(operations);
        }
        sc.close();
    }
}