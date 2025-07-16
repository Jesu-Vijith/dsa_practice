package LinkedList.LeetCode;

public class isPalindrome_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode revHead=reverse(mid);
        ListNode rerevHead=revHead;
        while(head!=null && revHead!=null){
            if(head.val!=revHead.val){
                break;
            }
            head=head.next;
            revHead=revHead.next;
        }
        return head==null || revHead==null;
    }
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
