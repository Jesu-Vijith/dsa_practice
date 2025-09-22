package LeetCode;

public class L_1721_SwappingNodesInLL {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode firstPrev=null;
            ListNode firstPres=head;
            ListNode firstNext=head.next;
            for(int i=1;i<k;i++){
                firstPrev=firstPres;
                firstPres=firstNext;
                if(firstNext!=null){
                    firstNext=firstNext.next;
                }
            }
            ListNode secPres=reverse(firstNext);
            ListNode ref=secPres;
            ListNode secPrev=null;
            ListNode secNext=secPres.next;
            for(int j=1;j<k;j++){
                secPrev=secPres;
                secPres=secNext;
                if(secNext!=null){
                    secNext=secNext.next;
                }
            }
            firstNext=reverse(ref);
            firstPrev.next=secPres;
            secPres.next=firstNext;
            secNext.next=firstPres;
            firstPres.next=secPrev;
            return head;
        }

        public ListNode reverse(ListNode head){
            ListNode prev=null;
            ListNode pres=head;
            ListNode next=head.next;
            while(pres!=null){
                pres.next=prev;
                prev=pres;
                pres=next;
                if(next!=null){
                    next=next.next;
                }
            }
            return prev;
        }

    public static void main(String[] args) {
        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(4,l1);
        ListNode l3=new ListNode(3,l2);
        ListNode l4=new ListNode(2,l3);
        ListNode l5=new ListNode(1,l4);
        L_1721_SwappingNodesInLL l=new L_1721_SwappingNodesInLL();
        ListNode ans=l.swapNodes(l5,2);
        while(ans!=null){
            System.out.print(ans.val+" -> ");
            ans=ans.next;
        }

    }
}

