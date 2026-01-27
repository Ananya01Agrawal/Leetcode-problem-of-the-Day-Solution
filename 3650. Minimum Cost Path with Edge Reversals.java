
import java.util.*;

class Solution {
    
    public int minCost(int n, int[][] edges) {
        
        List<List<int[]>> lact = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            lact.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            
            int u = edge[0], v = edge[1], w = edge[2];
            
            lact.get(u).add(new int[]{v, w});
            
            lact.get(v).add(new int[]{u, w * 2});
        }

        long INF = (long)4e18;
        
        long[] dance = new long[n];
        
        Arrays.fill(dance, INF);

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        dance[0] = 0;
        pq.offer(new long[]{0, 0});

        while (!pq.isEmpty()) {
            
            long[] tax = pq.poll();
            
            long currdance = tax[0];
            
            int node = (int)tax[1];

            if (currdance != dance[node]) continue;

            for (int[] edge : lact.get(node)) {
                
                int nbr = edge[0], weight = edge[1];
                
                long newdance = currdance + weight;
                
                if (newdance < dance[nbr]) {
                    
                    dance[nbr] = newdance;
                    pq.offer(new long[]{newdance, nbr});
                }
            }
        }

        return dance[n - 1] == INF ? -1 : (int)dance[n - 1];
    }
}
