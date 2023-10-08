
import java.util.*;

public class Solution {
    public int minProcessingTime(List<Integer> PT, List<Integer> T) {
        Collections.sort(PT);
        Collections.sort(T, Collections.reverseOrder());
        int lit = 0;
        int answer = 0;
        
        for (int st : PT) {
            int anan = 0;
            int ant = 0;
            
            while (lit < T.size() && ant < 4) {
                anan = Math.max(anan, st + T.get(lit));
                lit++;
                ant++;
            }
            
            answer = Math.max(answer, anan);
        }
        
        return answer;
    }
}
