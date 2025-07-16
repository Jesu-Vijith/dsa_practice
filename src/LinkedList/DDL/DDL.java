package LinkedList.DDL;

public class DDL {
    private Node head;
    private Node tail;
    private int size;

    public DDL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node();
        if(size==0){
            head=node;
            tail=node;  
            node.value=val;
            size++;
            return;
        }
        head.prev=node;
        node.next=head;
        node.value=val;
        head=node;
        size++;
    }

    public void insertLast(int val){
        Node node=new Node();
        if(size==0){
            insertFirst(val);
            return;
        }
        tail.next=node;
        node.prev=tail;
        node.value=val;
        node.next=null;
        tail=node;
        size++;
    }

    public void deleteFirst(){
        head=head.next;
        if(head!=null){
            head.prev=null;
            size--;
            return;
        }
        tail=null;
        size--;
    }

    public void deleteLast(){
        if(size==0){
            deleteFirst();
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    public void displayFromFront(){
        Node node=head;
        System.out.print("START -> ");
        while(node.next!=null){
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.print(node.value);
        System.out.println();

    }

    public void displayFromBack(){
        Node node=tail;
        System.out.print("END -> ");
        while(node.prev!=null){
            System.out.print(node.value+" -> ");
            node=node.prev;
        }
        System.out.print(node.value);
        System.out.println();
    }

    private static class Node{
        Node prev;
        Node next;
        int value;
    }
}
