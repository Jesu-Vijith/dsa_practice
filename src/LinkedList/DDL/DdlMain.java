package LinkedList.DDL;

public class DdlMain {
    public static void main(String[] args) {
        DDL ddl1=new DDL();
        ddl1.insertFirst(10);
        ddl1.insertFirst(20);
        ddl1.insertFirst(30);
        ddl1.insertFirst(40);
        ddl1.insertLast(-2);
        ddl1.insertLast(-3);
        ddl1.deleteFirst();
        ddl1.deleteLast();
        ddl1.displayFromFront();
        ddl1.displayFromBack();
    }
}
