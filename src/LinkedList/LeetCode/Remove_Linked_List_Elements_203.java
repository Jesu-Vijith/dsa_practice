package LinkedList.LeetCode;

public class Remove_Linked_List_Elements_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        if(head.next==null && head.val==val){
            return null;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;
        while(pres!=null){
            if(pres.val==val && prev!=null){
                pres.next=null;
                prev.next=next;
                pres=next;
                if(next!=null){
                    next=next.next;
                }
            }
            else if(pres.val==val && prev==null){
                pres.next=null;
                pres=next;
                head=pres;
                if(next!=null){
                    next=next.next;
                }
            }
            else{
                prev=pres;
                pres=next;
                if(next!=null){
                    next=next.next;
                }
            }
        }
        return head;
    }
}
