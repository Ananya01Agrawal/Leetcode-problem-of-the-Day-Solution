import java.util.*;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        
        Set<Integer>dest = new HashSet<>();// here we are creating a hashset

        //Iterate through each car represented by the list of integers
        for (List<Integer> points : nums) {
            //extract start and end point if the current car
            int mt = points.get(0), ed = points.get(1);

            //Iterate through the range of point form start to end
            for (int i = mt; i <= ed; ++i) {
                // add each point i to the hashset to ensure its uniqueness
                dest.add(i);
            }
        }
        // return the size of the hashmap which represnts the total number of unique paths

        return dest.size();
    }
}
