import java.util.*;

public class sequenceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			List<Long> b = new ArrayList<>(); 
			List<Long> a = new ArrayList<>(); 
			for (int i = 0; i < n; i++) {
				b.add(scanner.nextLong()); 
			}

			a.add(b.get(0)); 
			for (int i = 1; i < n; i++) {
				if (b.get(i) >= b.get(i - 1)) {
					a.add(b.get(i)); 
				} else {
					a.add(b.get(i)); 
					a.add(b.get(i)); 
				}
			}
			System.out.println(a.size()); 
			for (Long num : a) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		scanner.close();
    }
}