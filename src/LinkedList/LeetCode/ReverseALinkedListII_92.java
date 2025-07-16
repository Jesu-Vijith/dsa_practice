package LinkedList.LeetCode;

public class ReverseALinkedListII_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode present=head;
        ListNode previous=null;
        for(int i=1;i<left;i++){
            previous=present;
            present=present.next;
        }
        ListNode first=previous;
        ListNode newLast=present;

        previous=present;
        present=present.next;
        ListNode next=present.next;

        for(int i=left;i<right ;i++){
            present.next=previous;
            previous=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }

        ListNode newFirst=previous;
        ListNode last=present;

        if(first!=null){
            first.next=newFirst;
        }
        else{
            head=newFirst;
        }
        newLast.next=last;
        return head;
    }
}
