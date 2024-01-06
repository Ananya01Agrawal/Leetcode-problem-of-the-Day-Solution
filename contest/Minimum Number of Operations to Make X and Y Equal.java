import java.util.*;

public class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        
        Queue<Integer> queen = new ArrayDeque<>();
        
        queen.offer(x);
        
        int action = 0;
        
        Map<Integer, Integer> anan = new HashMap<>();
        
        while (!queen.isEmpty()) {
            
            int sz = queen.size();
            
            for (int j = 0; j < sz; j++) {
                
                int kin = queen.poll();
                
                if (kin > 1e4 || kin < 0) continue;
                
                if (kin == y) return action;
                
                if (kin % 11 == 0 && anan.getOrDefault(kin / 11, 0) == 0) {
                    
                    anan.put(kin / 11, 1);
                    queen.offer(kin / 11);
                }
                if (kin % 5 == 0 && anan.getOrDefault(kin / 5, 0) == 0) {
                    
                    anan.put(kin / 5, 1);
                    queen.offer(kin / 5);
                }
                if (kin > 0 && anan.getOrDefault(kin - 1, 0) == 0) {
                    
                    anan.put(kin - 1, 1);
                    queen.offer(kin - 1);
                }
                if (anan.getOrDefault(kin + 1, 0) == 0) {
                    
                    anan.put(kin + 1, 1);
                    queen.offer(kin + 1);
                }
            }
            action++;
        }
        return action;
    }
}
