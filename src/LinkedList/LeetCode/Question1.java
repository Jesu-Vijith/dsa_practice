package LinkedList.LeetCode;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        int value = head.val;
        ListNode node = head;
        ListNode ref = head;
        while (node != null) {
            if (node.val != value) {
                ref.next = node;
                ref = ref.next;
                value = ref.val;
            }
            node = node.next;
        }
        ref.next = null;
        return head;
    }
}

public class Question1{
    public static void main(String[] args) {
        ListNode l5=new ListNode(3,null);
        ListNode l4=new ListNode(3,l5);
        ListNode l3=new ListNode(2,l4);
        ListNode l2=new ListNode(1,l3);
        ListNode l1=new ListNode(1,l2);

        Solution s1=new Solution();
        ListNode ans=s1.deleteDuplicates(l1);

        ListNode temp=ans;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}