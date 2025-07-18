package LinkedList.LeetCode;

public class Merge_in_between_linkedlists_1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null || list1.next==null){
            return list1;
        }
        ListNode prev=null;
        ListNode pres=list1;
        ListNode next=pres.next;
        for(int i=0;i<a;i++){
            prev=pres;
            pres=next;
            if(next.next!=null){
                next=next.next;
            }
        }
        prev.next=list2;
        ListNode newLast=list2;
        while(newLast.next!=null){
            newLast=newLast.next;
        }
        prev=null;
        for(int i=a;i<b;i++){
            prev=pres;
            pres=next;
            if(next.next!=null){
                next=next.next;
            }
        }
        newLast.next=next;
        return list1;
    }
}

