package LeetCode;



public class L_23_MergeSortedArray {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode node=getNode(lists);
        if(node!=null){
            node.next=mergeKLists(lists);
        }
        return node;
    }

    public ListNode getNode(ListNode [] lists){
        boolean isListsFlag=false;
        int refValue=Integer.MAX_VALUE;
        int refIndex=-1;
        ListNode ans=null;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                isListsFlag=true;
                if(lists[i].val<refValue){
                    refValue=lists[i].val;
                    refIndex=i;
                }
            }
        }
        if(!isListsFlag){
            return null;
        }
        ans=lists[refIndex];
        lists[refIndex]=lists[refIndex].next;
        ans.next=null;
        return ans;
    }
}
