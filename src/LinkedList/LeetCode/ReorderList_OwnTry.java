package LinkedList.LeetCode;

public class ReorderList_OwnTry {
        public void reorderList(ListNode head) {
            ListNode mid=middle(head);
            ListNode revHead=reverse(mid);
            while(true){
                if(head!=null && revHead!=null){
                    ListNode headTemp=head.next;
                    ListNode revHeadTemp=revHead.next;
                    if(revHead==headTemp){
                        break;
                    }
                    head.next=revHead;
                    revHead.next=headTemp;
                    head=headTemp;
                    revHead=revHeadTemp;
                }
                else{
                    break;
                }
            }
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

