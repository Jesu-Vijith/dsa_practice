package LeetCode;

public class L_19_RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode tempHead=reverse(head);
        if(n==1){
            ListNode temp=tempHead.next;
            tempHead.next=null;
            ListNode ansHead=reverse(temp);
            return ansHead;
        }
        ListNode pres=tempHead;
        ListNode prev=null;
        ListNode next=pres.next;
        for(int i=2;i<=n;i++){
            prev=pres;
            pres=next;
            if(next!=null)next=next.next;
        }
        prev.next=next;
        pres.next=null;
        System.out.print(tempHead.val);
        ListNode ansHead=reverse(tempHead);
        return ansHead;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode pres=head;
        ListNode prev=null;
        ListNode next=null;
        if(pres.next!=null){
            next=pres.next;
        }
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }
}
