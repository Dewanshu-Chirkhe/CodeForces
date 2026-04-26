import java.io.*;
import java.util.*;

public class targetPractice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int score = 0;
            for(int i=1 ; i<=10 ; i++){
                String row = sc.next();
                for(int j=1 ; j<=10 ; j++){
                    char ch = row.charAt(j-1);
                    if(ch == 'X'){
                        score += Math.min(Math.min(i, j), Math.min(11-i, 11-j));
                    }
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}