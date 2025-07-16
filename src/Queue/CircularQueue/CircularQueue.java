package Queue.CircularQueue;

public class CircularQueue {

    protected int[]data;
    private static final int DEFAULT_SIZE=10;

    int start=0;
    int end=0;
    int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int x){
        if(isFull()){
            return false;
        }
        data[end++]=x;
        end=end % data.length;
        size++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int elem=data[start++];
        start=start%data.length;
        size--;
        return elem;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[start];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int f=start;
        do{
            System.out.print(data[f]+" -> ");
            f++;
            f=f%data.length;
        }
        while(f!=end);
        System.out.print("END");
        System.out.println();
    }
}
