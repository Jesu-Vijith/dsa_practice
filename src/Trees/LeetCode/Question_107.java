package Trees.LeetCode;

import java.util.*;

import Trees.BinarySearchTree.Node;

public class Question_107 {
    public List<List<Integer>> levelOrderBottom(Node root) {
        Queue<Node> queue=new LinkedList<>();
        List<List<Integer>>outer=new ArrayList<>();
        if(root==null){
            return outer;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>inner=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                inner.add(node.value);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            outer.add(inner);
        }
        Collections.reverse(outer);
        return outer;
    }
}
