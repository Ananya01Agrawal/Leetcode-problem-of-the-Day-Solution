class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dm = new ListNode(); // Create a dummy node to store the result
        ListNode tmp = dm; // Create a temporary node to traverse and build the result
        int carry = 0; // Variable to hold the carry value

        // Loop until both input lists reach the end and there's no carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            // If l1 node exists, add its value to sum and move to next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // If l2 node exists, add its value to sum and move to next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry; // Add carry from the previous iteration
            carry = sum / 10; // Calculate the carry for the next iteration
            ListNode resultNode = new ListNode(sum % 10); // Create a new node with the calculated sum
            tmp.next = resultNode; // Link the new node to the result list
            tmp = tmp.next; // Move the temporary pointer to the newly added node
        }

        return dm.next; // Return the result list starting from the node after the dummy node
    }
}
