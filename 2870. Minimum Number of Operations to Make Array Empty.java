class Solution {
     public int minOperations(int[] nums) {
         //create a Hashap to store the frequency of each unique element
         Map<Integer,Integer> freq=new HashMap<>();
         int count=0;

         //Build the frequency map
         for(int x:nums){
             freq.put(x,freq.getOrDefault(x,0)+1);
         }

         //iterate through the frequency map
         for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
             int c=entry.getValue();

             
            // Check if a single element cannot be used in any operation
            if (c == 1) {
                return -1;
            }

            // Step 3: Calculate the number of operations for the current element
            count += c / 3;

            // If there are remaining elements, add one more operation to the count
            if (c % 3 != 0) {
                count++;
            }
        }

        // Step 4: Return the total count, representing the minimum operations required
        return count;
    }
}

