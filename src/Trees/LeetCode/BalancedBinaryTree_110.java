package Trees.LeetCode;

public class    BalancedBinaryTree_110 {
        public boolean isBalanced(TreeNode root) {
            int height=balanced(root);
            System.out.println(height);
            return Math.abs(height)>1?false:true;
        }
        private int balanced(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=balanced(root.left);
            int right=balanced(root.right);
            int height=(left-right)+1;
            return height;
        }
    }

