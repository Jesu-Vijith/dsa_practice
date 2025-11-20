package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int node;
    int parent;
    public Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

public class DetectCycleUndirectedGraphBFS {
    public static void main(String[] args) {
//        int[][]adjacency={
//                {},
//                {2,3},
//                {1,5},
//                {4,1,6},
//                {3},
//                {2,7},
//                {3,7},
//                {5,6}
//        };

                int[][] adjacency = {
                {},
                {2, 3},
                {1, 4},
                {1, 5},
                {2},
                {3, 6},
                {5}
        };
        DetectCycleUndirectedGraphBFS b1=new DetectCycleUndirectedGraphBFS();
        System.out.println(b1.bfs(adjacency));
    }
    public boolean bfs(int[][]adjacency){
        Queue<Pair> queue=new LinkedList<>();
        boolean []visited=new boolean[adjacency.length];
        queue.add(new Pair(1,-1));
        visited[1]=true;
        while(!queue.isEmpty()){
            Pair p=queue.poll();
            int node=p.node;
            int parent=p.parent;
            int[]adj=adjacency[node];
            for(int n:adj){
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(new Pair(n,node));
                }
                else if(n!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}
