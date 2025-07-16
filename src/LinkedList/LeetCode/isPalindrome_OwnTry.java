package LinkedList.LeetCode;

public class isPalindrome_OwnTry {
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
            ListNode mid=middle(head);
            ListNode prev=null;
            ListNode pres=mid;
            ListNode next=pres.next;
            while(pres!=null){
                pres.next=prev;
                prev=pres;
                pres=next;
                if(next!=null){
                    next=next.next;
                }
            }
            while(prev!=null){
                if(head.val!=prev.val){
                    return false;
                }
                head=head.next;
                prev=prev.next;
            }
            return true;
        }
        private ListNode middle(ListNode head){
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    }

