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

// approach which we are using in this question
//1. find the middle of the linked list
// 2. do second half revese of the linked list
//3. do the alternate merging
class Solution {
    public void reorderList(ListNode head) {
        // finding the middle of the linekd list
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;

        // reverse 2nd half of the list
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // alternate merging
        ListNode left  = head;
        ListNode right = prev;
        ListNode nextL, nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }
}



        
