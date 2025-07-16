package Queue.CircularQueue;

import Queue.CustomQueue;

public class Main {
        public static void main(String[] args) throws Exception {
            CircularQueue queue=new CircularQueue(5);
            queue.insert(1);
            queue.insert(2);
            queue.insert(3);
            queue.insert(4);
            queue.insert(5);
            queue.remove();
            queue.insert(6);
            queue.display();
            queue.remove();
            queue.insert(100);
            queue.display();
        }
    }


