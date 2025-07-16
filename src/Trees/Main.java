package Trees;

import Trees.LeetCode.LevelOrderSuccessorOfANode;
import Trees.LeetCode.Question_102;
import Trees.BinarySearchTree.Node;
import Trees.LeetCode.Question_637;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        int []nums={6, 3, 1, 2, 4, 5, 9, 7, 8, 10, 11};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.serialize(tree.getRoot()));
        BFS bfs=new BFS();
//        bfs.breadthFirst(tree.getRoot());
//        System.out.println(ques102.levelOrder(tree.getRoot()));
//        Question_637 ques_637=new Question_637();
//        System.out.println(ques_637.averageOfLevels(tree.getRoot()));
//        LevelOrderSuccessorOfANode ans=new LevelOrderSuccessorOfANode();
//        Node ansNode=ans.levelOrder(11,tree.getRoot());
//        if (ansNode==null){
//            System.out.println("NULL");
//        }
//        else{
//            System.out.println(ansNode.value);
//        }
    }
}
