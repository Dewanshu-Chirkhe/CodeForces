import java.util.*;

public class DivanAndANewProject_1614B {
    static class Pair{
        int idx;
        int visits;
        Pair(int idx, int visits){
            this.idx = idx;
            this.visits = visits;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> b.visits - a.visits
            );
            for(int i=0 ; i<n ; i++){
                int visits = sc.nextInt();
                pq.add(new Pair(i, visits));
            }

            int[] ans = new int[n+1];
            boolean alternate = true;
            int leftIdx = -1, rightIdx = 1;
            long sum = 0;
            for(int i=0 ; i<n ; i++){
                Pair curr = pq.poll();
                if(alternate){
                    ans[curr.idx+1] = leftIdx;
                    sum += 2L * Math.abs(leftIdx) * curr.visits;
                    leftIdx--;
                } 
                else{
                    ans[curr.idx+1] = rightIdx;
                    sum += 2L * Math.abs(rightIdx) * curr.visits;
                    rightIdx++;
                }
                alternate = !alternate;
            }

            System.out.println(sum);
            for(int ele : ans){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
