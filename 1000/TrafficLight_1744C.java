import java.util.*;

public class TrafficLight_1744C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Character c = sc.next().charAt(0);
            String s = sc.next();

            s += s;
            n *= 2;

            int lastGreenIndex = -1;
            int maxWait = 0;

            for(int i=n-1 ; i>=0 ; i--){
                char ch = s.charAt(i);
                if(ch == 'g') lastGreenIndex = i;
                else if(ch == c){
                    int difference = lastGreenIndex - i;
                    maxWait = Math.max(maxWait, difference);
                }
            }

            System.out.println(maxWait);
        }

        sc.close();
    }
}
