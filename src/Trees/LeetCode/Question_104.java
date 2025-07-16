package Trees.LeetCode;
import Trees.BinarySearchTree.Node;

import java.util.LinkedList;
import java.util.Queue;

class Question_104 {

    //PERFECT SOLUTION
    int globalAns=Integer.MIN_VALUE;
    public int maxPathSum(Node root) {
        int ans=max(root);
        return globalAns;
    }

    private int max(Node root){
        if(root==null){
            return 0;
        }
        int current=root.value;
        int left=max(root.left);
        int right=max(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int pathSum=current+left+right;
        globalAns=Math.max(globalAns,pathSum);
        return current+Math.max(left,right);
    }
    //================================================================
    public int ownTryPathSum(Node root) {
        Queue<Integer> queue=new LinkedList<>();
        ownTryMaxPath(root,queue);
        int ans=queue.poll();
        System.out.println(ans);
        while(!queue.isEmpty()){
            int elem=queue.poll();
            System.out.println(elem);
            if(elem>ans){
                ans=elem;
            }
        }
        return ans;
    }
    private void ownTryMaxPath(Node root, Queue queue){
        if(root==null){
            return;
        }
        int sum=root.value;
        queue.add(sum);
        if(root.left!=null){
            sum+=root.left.value;
        }
        if(root.right!=null){
            sum+=root.right.value;
        }
        ownTryMaxPath(root.left,queue);
        ownTryMaxPath(root.right,queue);
        queue.add(sum);

    }
}