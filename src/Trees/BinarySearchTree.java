package Trees;

import LeetCode.TreeNode;

public class BinarySearchTree {
    public class Node{
        public int value;
        public int height;
        public Node left;
        public Node right;

        Node(int value){
            this.value=value;
        }
    }
    private Node root;

    public Node getRoot(){
        return this.root;
    }

    public BinarySearchTree(){

    }
    public int height(BinarySearchTree.Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public void populate(int[]nums){
        for(int elem : nums){
            this.insert(elem);
        }
    }

    private void insert(int num) {
        root=insert(root,num);
    }
    private Node insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void display(){
        display("RootNode: ",root);
    }
    private void display(String details,Node node){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display("Left Node of "+node.value+" is: ",node.left);
        display("Right Node of "+node.value+" is: ",node.right);
    }

    String ans="";
    public String serialize(Node root){
        serializing(root);
        return ans;
    }

    private void serializing(Node root){
        if(root==null){
            ans+=" null";
            return;
        }
        ans+=" "+root.value;
        serializing(root.left);
        serializing(root.right);
    }
}
