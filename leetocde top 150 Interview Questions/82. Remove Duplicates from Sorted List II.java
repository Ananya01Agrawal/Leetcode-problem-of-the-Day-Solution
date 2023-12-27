class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(head!= null){
            // if both values are equal we need to skip those values
            if(head.next!=null && head.val==head.next.val){
                //skip the nodes that are equal
                while(head.next!=null && head.val==head.next.val){
                    // if condition is true move the head ti head.next
                    head = head.next;
                }
                //connecting the links
                prev.next = head.next;
            }
            // if the values are not equal
            else{
                prev = prev.next;
            }
            //otherwise move the head equal to head.next
            head = head.next;
        }
        return dummy.next;
    }
}
