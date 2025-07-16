package Trees.LeetCode;
import Trees.BinarySearchTree.Node;

import java.util.*;

public class Question_103 {
    public List<List<Integer>> zigzagLevelOrder(Node root) {
        Queue<Node> queue=new ArrayDeque<>();
        List<List<Integer>>outer=new ArrayList<>();
        if(root==null){
            return outer;
        }
        queue.add(root);
        int counter=1;
        while(!queue.isEmpty()){
            List<Integer>inner=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node=queue.peek();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                inner.add(queue.poll().value);
            }
            if(counter%2==0){
                Collections.reverse(inner);
            }
            counter++;
            outer.add(inner);
        }
        return outer;
    }
}
