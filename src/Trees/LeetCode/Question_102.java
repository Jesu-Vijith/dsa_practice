package Trees.LeetCode;
import Trees.BinarySearchTree.Node;

import java.util.*;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class Question_102 {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node>queue=new ArrayDeque<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        return levelOrderPvt(list,queue);
    }

    private List<List<Integer>> levelOrderPvt(List<List<Integer>>list, Queue<Node>queue){
        if(queue.isEmpty()){
            return list;
        }
        int count=0;
        List<Integer>inner=new ArrayList<>();
        int size=queue.size();
        while(count<size){
            Node node=queue.peek();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            inner.add(node.value);
            queue.poll();
            count++;
        }
        list.add(inner);
        return levelOrderPvt(list,queue);
    }

    private List<List<Integer>>levelOrderAns(List<List<Integer>>list,Queue<Node>queue){
        if(queue.isEmpty()){
            return list;
        }
        int count=0;
        int size=queue.size();
        List<Integer>inner=new ArrayList<>();
        while(count<size){
            Node node=queue.peek();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            inner.add(node.value);
            queue.poll();
            count++;
        }
        list.add(inner);
        return levelOrderAns(list,queue);
    }
}
