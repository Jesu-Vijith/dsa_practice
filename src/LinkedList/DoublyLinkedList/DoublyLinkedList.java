package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size=0;
    }

    private class Node{
        int value;
        Node prev;
        Node next;
    }

    public void insertFirst(int val){
        Node node=new Node();
        node.prev=null;
        node.value=val;
        if(head!=null) {
            node.next = head;
            
        }
        head=node;
        size++;
    }

    public void display(){
        while(head.next!=null){
            System.out.print(head.value+" => ");
            head=head.next;
        }
        System.out.print(head.value+" START ");
        while(tail.prev!=null){
            System.out.print(tail.value+" => ");
            tail=tail.prev;
        }
        System.out.println(tail.value+" END ");
    }
}
