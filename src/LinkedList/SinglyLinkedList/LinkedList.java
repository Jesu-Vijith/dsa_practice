package LinkedList.SinglyLinkedList;

public class LinkedList {
    public Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    //My approach insertLast
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null && tail==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
        size++;
    }

    //Kunal's Approach insertLast
    public void insertLast1(int val){
        Node node=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    //Kunal Approach
    public int deleteLast1(){
        if(size<=1){
            return deleteFirst();
        }
        System.out.println(size);
        Node node=get(size-1);
        int val=tail.value;
        tail=node;
        tail.next=null;
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void getNode(int value){
        Node node=head;
        for(int i=1;i<=size;i++){
            if (node.value==value){
                System.out.println(node.value);
                System.out.println(node.next.value);
                return;
            }
            node=node.next;
        }
        System.out.println("NOT FOUND");
    }

    //My Approach
    public int deleteLast(){
        if(size==1){
            return deleteFirst();
        }
        int val=0;
        Node temp=head;
        while(temp!=tail){
            if(temp.next==tail){
                val=tail.value;
                break;
            }
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index){
        if (index==1){
            deleteFirst();
        }
        if(index==size){
            deleteLast1();
        }
        Node node=get(index-1);
        int val=node.next.value;
        node.next=node.next.next;
        size--;
        return val;
    }


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        public int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
