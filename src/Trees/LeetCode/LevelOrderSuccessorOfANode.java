package Trees.LeetCode;
import Trees.BinarySearchTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {
    public Node levelOrder(int ans,Node node){
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null) {
                queue.add(temp.right);
            }
            if (temp.value==ans){
                break;
            }
        }
        return queue.poll();
    }
}
