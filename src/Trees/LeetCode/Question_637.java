package Trees.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.BinarySearchTree.Node;


public class Question_637 {
    public List<Double> averageOfLevels(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        List<Double>ansList=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            int count=0;
            double levelAns=0;
            while(count<size){
                Node node=queue.peek();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                levelAns+=(double)node.value;
                queue.poll();
                count++;
            }
            levelAns=levelAns/size;
            ansList.add(levelAns);
        }
        return ansList;
    }
}
