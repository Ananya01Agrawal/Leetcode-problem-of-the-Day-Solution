class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> bal=new HashMap<>(); // Map for Ball e.g. bal<ball, color>
        Map<Integer, Integer> col=new HashMap<>();  // Map for Color e.g. col<color, value>
        int n=queries.length;
        int[] res=new int[n];

        // Iterate the queries
        for(int i=0; i<n; i++){
            if(bal.containsKey(queries[i][0])){ // Check if ball contains in map "bal"
                if(bal.get(queries[i][0])==queries[i][1]){
                    res[i]=col.size();
                    continue;
                }
                else if(col.get(bal.get(queries[i][0]))==1){ // Check if color's value is 1 for corresponding ball's color
                    col.remove(bal.get(queries[i][0])); // Remove the color 
                }else{
                    col.put(bal.get(queries[i][0]), col.get(bal.get(queries[i][0]))-1); // Otherwise decrease the color's vlaue
                }                
            }

            bal.put(queries[i][0],queries[i][1]); // Set the ball and color            
            col.put(queries[i][1],col.getOrDefault(queries[i][1],0)+1); // Increase the color's value

            // Put distinct color size into result array
            res[i]=col.size();
        }
        
        return res;
    }
}
