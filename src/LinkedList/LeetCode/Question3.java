package LinkedList.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;


class ListNodeQn3 {
  int val;
  ListNodeQn3 next;
  ListNodeQn3(int x) {
      val = x;
      next = null;
  }
}

public class Question3 {
    public boolean hasCycle(ListNodeQn3 head) {
        List<ListNodeQn3> nodeRef=new ArrayList<>();
        if(head==null){
            return false;
        }
        nodeRef.add(head);
        while(head.next!=null){
            if(nodeRef.contains(head.next)){
                return true;
            }
            head=head.next;
            nodeRef.add(head);
        }
        return false;
    }

}