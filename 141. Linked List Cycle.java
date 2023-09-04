/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // start a slow and fast pointer and initialize to he head
        ListNode slowPtr= head;
        ListNode fastPtr=head;

        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
            // if slow pointer reaches to the null and fast pointer reaches to the null
            //Advance both the pointers
            slowPtr=slowPtr.next;// moving the one step
            fastPtr=fastPtr.next.next;// moving the two step

            // if they meet ,means we found a loop
            if(slowPtr==fastPtr){
                return true;
            }


        }
        return false;

    }
}
