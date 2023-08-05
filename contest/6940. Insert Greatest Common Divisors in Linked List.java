/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // Function to insert Greatest Common Divisors (GCD) between consecutive nodes in a linked list
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode accur = head; // Create a pointer 'accur' to traverse the linked list
        
        // Traverse the linked list until the end or the second last node
        while (accur != null && accur.next != null) {
            // Calculate the Greatest Common Divisor (GCD) between the current node's value and the next node's value
            int aim = calculateGCD(accur.val, accur.next.val);
            
            // Create a new node with the calculated GCD value
            ListNode bim = new ListNode(aim);
            
            // Insert the new node between the current node and the next node
            bim.next = accur.next;
            accur.next = bim;
            
            // Move the 'accur' pointer two steps ahead to skip the newly inserted node
            accur = accur.next.next;
        }
        
        // Return the updated linked list head
        return head;
    }

    // Function to calculate the Greatest Common Divisor (GCD) using Euclidean algorithm
    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
