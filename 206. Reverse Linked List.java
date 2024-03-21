class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;// save the next node
            curr.next=prev;//reverse the link
            prev=curr;//move pointers one position ahead
            curr=next;
        }
        return prev;
        
    }
}
