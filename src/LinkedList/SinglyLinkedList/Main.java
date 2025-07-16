package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.insertLast(3);
        l1.insertLast(5);
        l1.insertLast(8);
        l1.insertLast(9);
        l1.insertLast(17);
        l1.display();
        l1.deleteAtIndex(3);
        l1.deleteAtIndex(3);
        l1.display();
        l1.getNode(5);



    }
}
