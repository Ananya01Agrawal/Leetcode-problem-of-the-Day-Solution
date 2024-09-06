class Solution {
    public ListNode modifiedList(int[] poiuy, ListNode head) {
        // Convert the array poiuy to a HashSet for O(1) lookups
        
        int wero=0;
        int yuni=0;
        
        HashSet<Integer> sim = new HashSet<>();
        
        for (int inty : poiuy) {
            
            sim.add(inty);
        }

        // Create a anan node to handle edge cases
        
        ListNode anan = new ListNode(0);
        
        anan.next = head;
        
        ListNode reci = anan;
        

        // Iterate through the list and remove nodes with values in sim
        
        while (reci.next != null) {
            
            if (sim.contains(reci.next.val)) {
                
                // Remove the node by adjusting pointers
                
                ListNode toDelete = reci.next;
                
                reci.next = reci.next.next;
                
                toDelete.next = null; // Clean up the next pointer for garbage collection
            } 
            else {
                
                reci = reci.next;
            }
        }

        // Return the modified list starting from anan.next
        return anan.next;
    }
}
