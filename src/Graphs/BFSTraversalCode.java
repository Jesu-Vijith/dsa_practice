package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversalCode {

    public ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>>adjacencyList){
        ArrayList<Integer>list=new ArrayList<>();
        boolean [] visited=new boolean[adjacencyList.size()+1];
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            Integer node=queue.poll();
            list.add(node);            visited[node]=true;
            for(Integer n: adjacencyList.get(node-1)){
                if(!visited[n]){
                    queue.add(n);
                    visited[n]=true;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adjacency=new ArrayList<>();
        adjacency.add(new ArrayList<>(List.of(2,6)));
        adjacency.add(new ArrayList<>(List.of(3,4,1)));
        adjacency.add(new ArrayList<>(List.of(2)));
        adjacency.add(new ArrayList<>(List.of(2,5)));
        adjacency.add(new ArrayList<>(List.of(4,8)));
        adjacency.add(new ArrayList<>(List.of(1,7,9)));
        adjacency.add(new ArrayList<>(List.of(6,8)));
        adjacency.add(new ArrayList<>(List.of(5,7)));
        adjacency.add(new ArrayList<>(List.of(6)))
;
        BFSTraversalCode b1=new BFSTraversalCode();
        System.out.println(b1.bfsTraversal(adjacency));
    }

}
