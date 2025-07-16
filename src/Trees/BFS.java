package Trees;

import Trees.BinarySearchTree.Node;
import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static Queue<BinarySearchTree.Node> queue=new ArrayDeque<>();

    public void breadthFirst(Node node){
        queue.add(node);
        breadthFirstInt(queue);
        System.out.print("END");
    }

    public void breadthFirstInt(Queue<BinarySearchTree.Node>queue){
        if(queue.isEmpty()){
            return;
        }
        Node node= queue.peek();
        System.out.print(node.value+" -> ");
        if(node.left!=null){
            queue.add(node.left);
        }
        if(node.right!=null){
            queue.add(node.right);
        }
        queue.poll();
        breadthFirstInt(queue);

    }
}
