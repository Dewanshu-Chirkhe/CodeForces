import java.util.*;

public class O1Game_1373B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            int countOne = 0, countZero = 0;
            for(char ch : s.toCharArray()){
                if(ch == '0') countZero++;
                else countOne++;
            }

            int operations = Math.min(countOne, countZero);

            if(operations % 2 != 0) System.out.println("DA");
            else System.out.println("NET");
        }
        sc.close();
    }
}
