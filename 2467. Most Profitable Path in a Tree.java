class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
     int n = amount.length;
        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        
        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }
        
        int[] bobTime = new int[n];
        Arrays.fill(bobTime, Integer.MAX_VALUE);
        dfsBob(bob, 0, tree, bobTime, new boolean[n], 0);
        
        return dfsAlice(0, 0, tree, amount, new boolean[n], bobTime, 0);
    }
    
    private boolean dfsBob(int node, int time, List<Integer>[] tree, int[] bobTime, boolean[] visited, int target) {
        visited[node] = true;
        
        if (node == target) {
            bobTime[node] = time;
            return true;
        }
        
        for (int neighbor : tree[node]) {
            if (!visited[neighbor] && dfsBob(neighbor, time + 1, tree, bobTime, visited, target)) {
                bobTime[node] = time;
                return true;
            }
        }
        
        return false;
    }
    
    private int dfsAlice(int node, int time, List<Integer>[] tree, int[] amount, boolean[] visited, int[] bobTime, int total) {
        visited[node] = true;
        
        if (time < bobTime[node]) {
            total += amount[node];
        } else if (time == bobTime[node]) {
            total += amount[node] / 2;
        }
        
        int maxProfit = Integer.MIN_VALUE;
        boolean isLeaf = true;
        
        for (int neighbor : tree[node]) {
            if (!visited[neighbor]) {
                isLeaf = false;
                maxProfit = Math.max(maxProfit, dfsAlice(neighbor, time + 1, tree, amount, visited, bobTime, total));
            }
        }
        
        visited[node] = false;
        return isLeaf ? total : maxProfit;
    }   
    
}
