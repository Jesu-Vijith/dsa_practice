package LeetCode;


public class L_237_DeleteNode {
    public void deleteNode(ListNode node) {
        delNode(node,null);
        return;
    }

    private int delNode(ListNode node,ListNode prev){
        if(node.next==null){
            int ans=node.val;
            prev.next=null;
            return ans;
        }
        int ans=node.val;
        node.val=delNode(node.next,node);
        return ans;
    }
}
