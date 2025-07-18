package Trees.LeetCode;
import Trees.BinarySearchTree.Node;
public class    BalancedBinaryTree_110 {
        public boolean isBalanced(Node root) {
            int height=balanced(root);
            System.out.println(height);
            return Math.abs(height)>1?false:true;
        }
        private int balanced(Node root){
            if(root==null){
                return 0;
            }
            int left=balanced(root.left);
            int right=balanced(root.right);
            int height=(left-right)+1;
            return height;
        }
    }

