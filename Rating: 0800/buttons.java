import java.util.*;

public class buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a + (c % 2) > b)
                System.out.println("First");
            else
                System.out.println("Second");
        }

        sc.close();
    }
}