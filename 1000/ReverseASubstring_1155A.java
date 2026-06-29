import java.util.*;

public class ReverseASubstring_1155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        boolean flag = false;
        for(int i=0 ; i<n-1 ; i++){
            if(s.charAt(i) > s.charAt(i + 1)){
                System.out.println("YES");
                System.out.println((i+1)+" "+(i+2));
                flag = true;
                break;
            }
        }

        if(!flag) System.out.println("NO");

        sc.close();
    }
}
