import java.util.*;

public class SwapAndDelete_1913B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            int countOne = 0;
            int countZero = 0;
            for(char ch : s.toCharArray()){
                if(ch == '1') countOne++;
                else countZero++;
            } 

            int operations = 0;
            if(countOne == countZero){
                System.out.println(0);
                continue;
            }
            else{
                for(int i=0 ; i<s.length() ; i++){
                    char ch = s.charAt(i);

                    if ((ch == '1' && countZero == 0) || (ch == '0' && countOne == 0)) {
                        operations = s.length() - i;
                        break;
                    }

                    if (ch == '1') countZero--;
                    else countOne--;
                }
            }

            System.out.println(operations);
        }
        sc.close();
    }
}
