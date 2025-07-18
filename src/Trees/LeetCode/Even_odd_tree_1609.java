package Trees.LeetCode;
import Trees.BinarySearchTree.Node;

import java.util.LinkedList;
import java.util.Queue;


public class Even_odd_tree_1609 {
    public boolean isEvenOddTree(Node root) {
        boolean flag=true;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            System.out.println(queue.peek().value);
            int max=queue.peek().value;
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

                if(flag && max>=node.value){
                    return false;
                }
                else if(!flag && max<=node.value){
                    return false;
                }
                max=node.value;
            }
            flag=!flag;

        }
        return true;
    }
}
