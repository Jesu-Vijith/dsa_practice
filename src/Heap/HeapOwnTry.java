package Heap;

import java.util.ArrayList;

//HEAP-MAX
public class HeapOwnTry {
    ArrayList<Integer>heap=new ArrayList<>();
    public void insert(int val){
        if(heap.isEmpty()){
            heap.add(null);
            heap.add(val);
            return;
        }
        if(heap.get(1)<val) {
            heap.add(1, val);
        }
        else{
            heap.add(val);
        }
        int child=heap.size()-1;
        int parent=child/2;
        while(parent >0 && heap.get(parent)<heap.get(child)){
            int temp=heap.get(parent);
            heap.set(parent,heap.get(child));
            heap.set(child,temp);
            child=parent;
            parent=child/2;
        }
    }

    public void remove(){
        int elem=heap.removeLast();
        heap.set(1,elem);
        int i=1;
        while(i*2<heap.size()-1){
            int left=i*2;
            int right=i*2+1;
            if(heap.get(left)>heap.get(right)){
                int temp=heap.get(left);
                heap.set(left,heap.get(i));
                heap.set(i,temp);
                i=left;
            }
            else {
                int temp = heap.get(right);
                heap.set(right, heap.get(i));
                heap.set(i, temp);
                i = right;
            }
        }
    }

    public void display(){
        heap.removeFirst();
        System.out.println(heap);
        heap.addFirst(null);
    }
    public int maxElement(){
        return heap.get(1);
    }

    public static void main(String[] args) {
        HeapOwnTry h1=new HeapOwnTry();
        h1.insert(7);
        h1.insert(8);
        h1.insert(9);
        h1.insert(5);
        h1.insert(11);
        h1.insert(12);
        h1.insert(14);
        h1.insert(13);

        System.out.println(h1.maxElement());
        h1.display();
        h1.remove();
        System.out.println(h1.maxElement());
        h1.display();
    }
}
