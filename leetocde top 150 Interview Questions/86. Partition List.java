lass Solution {
    public ListNode partition(ListNode head, int x) {
        //creating the two dummy linkedlist
        ListNode small=new ListNode(0);
        ListNode higher=new ListNode(0);

        ListNode smallHead=small,higherHead=higher;

        while(head!=null){
            if(head.val<x){
                //small list
                smallHead.next=head;
                smallHead=smallHead.next;

            }
            else{
                //high list
                higherHead.next=head;
                higherHead=higherHead.next;
            }
            head=head.next;
        }
        //connecting these two linked list
        //connecting the last node of smaller linekdlist to first node of higher linkedlist

        higherHead.next=null;
        smallHead.next=higher.next;
        return small.next;


        
    }
}
