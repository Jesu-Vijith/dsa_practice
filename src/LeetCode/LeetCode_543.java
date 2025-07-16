package LeetCode;

import Trees.BinarySearchTree;

public class LeetCode_543 {
        public int diameterOfBinaryTree(TreeNode root) {
            int left=diameterOfTree(root.left);
            int right=diameterOfTree(root.right);
            return left+right;
        }
        private int diameterOfTree(TreeNode node){
            if(node==null){
                return 0;
            }
            int left=diameterOfTree(node.left)+1;
            int right=diameterOfTree(node.right)+1;
            return Math.max(left,right);
        }
        public static void main(String[] args) {
            BinarySearchTree tree=new BinarySearchTree();
            int[]nums={4,-7,-3,-9,-3,9,-7,-4,6,-6,-6,0,6,5,9,-1,-4,-2};
            tree.populate(nums);
            LeetCode_543 ans=new LeetCode_543();
            BinarySearchTree.Node root=tree.getRoot();
            
        }
}



