package LinkedList.LeetCodeProblems;

import LinkedList.SinglyLinkedList.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListNodeQn4 {
    int val;
    ListNodeQn4 next;
    public ListNodeQn4() {}
    public ListNodeQn4(int val){
        this.val = val;
    }
    public ListNodeQn4(int val, ListNodeQn4 next) {
        this.val = val;
        this.next = next;
    }

    public static void display(ListNodeQn4 head){
        ListNodeQn4 temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static ListNodeQn4 detectCycle(ListNodeQn4 head){
        ListNodeQn4 node=head;
        if(node==null){
            return null;
        }
        List<ListNodeQn4> nodeList=new ArrayList<>();
        nodeList.add(head);
        while(node.next!=null){
            if(nodeList.contains(node.next)){
                return node.next;
            }
            nodeList.add(node.next);
            node=node.next;
        }
        return null;
    }

    public static Integer detectCyclePos(ListNodeQn4 head){
        ListNodeQn4 node=head;
        if(node==null){
            return -1;
        }
        Map<ListNodeQn4,Integer> nodes=new HashMap<>();
        int count=0;
        nodes.put(head,count);
        while(node.next!=null){
            if(nodes.containsKey(node.next)){
                return nodes.get(node.next);
            }
            count++;
            nodes.put(node.next,count);
            node=node.next;
        }
        return -1;
    }

    public static int detectLengthCycleFastSlowPointer(ListNodeQn4 l1) {
        ListNodeQn4 fast=l1;
        ListNodeQn4 slow=l1;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int length=0;
                do{
                   slow=slow.next;
                   length++;
                }
                while(slow!=fast);
                return length;
            }
        }
        return 0;
    }

    public static Integer detectCyclePos1(ListNodeQn4 head){
        ListNodeQn4 node=head;
        if(node==null){
            return -1;
        }
        Map<ListNodeQn4,Integer> nodes=new HashMap<>();
        int count=0;
        nodes.put(head,count);
        while(node.next!=null){
            if(nodes.containsKey(node.next)){
                return nodes.get(node.next);
            }
            count++;
            nodes.put(node.next,count);
            node=node.next;
        }
        return -1;
    }


}

public class CyclicLinkedList {
    public static void main(String[] args) {
        ListNodeQn4 l1=new ListNodeQn4(1);
        ListNodeQn4 l2=new ListNodeQn4(2);
        ListNodeQn4 l3=new ListNodeQn4(3);
        ListNodeQn4 l4=new ListNodeQn4(4);
        ListNodeQn4 l5=new ListNodeQn4(5);
        ListNodeQn4 l6=new ListNodeQn4(6);
        ListNodeQn4 l7=new ListNodeQn4(7);
        ListNodeQn4 l8=new ListNodeQn4(8);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        l8.next=l2;
        ListNodeQn4 ans=ListNodeQn4.detectCycle(l1);
//        if(ans!=null){
//            System.out.println(ans.val);
//        }
//        System.out.println(ListNodeQn4.detectCyclePos(l1));
//        System.out.println(ListNodeQn4.detectLengthCycleFastSlowPointer(l1));
    }
}
