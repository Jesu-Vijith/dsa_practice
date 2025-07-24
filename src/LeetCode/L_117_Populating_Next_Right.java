package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class L_117_Populating_Next_Right {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if (root == null) return root;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int level = q.size();
            while (level-- > 0) {
                Node curr = q.poll();
                if (level != 0) curr.next = q.peek();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return root;
    }

    public Node connect1(Node root) {
        if(root==null || root.next==null){
            return root;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

                System.out.println(size);
                if(i==size-1){
                    node.next=null;
                }
                else{
                    node.next=queue.peek();
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
