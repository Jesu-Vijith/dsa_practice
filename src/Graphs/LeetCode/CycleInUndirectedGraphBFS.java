package Graphs.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleInUndirectedGraphBFS {

    public boolean cycle(int[][]adjacency){
        Queue<List<Integer>>queue=new LinkedList<>();
        queue.add(new ArrayList<>(List.of(1,-1)));
        boolean [] visited=new boolean[adjacency.length];
        visited[1]=true;
        List<Integer>list;
        while(!queue.isEmpty()){
            list = queue.poll();
            int node = list.getFirst();
            int parent = list.getLast();
            for(int n:adjacency[node]){
                visited[n]=true;
                if(!visited[n]){
                    queue.add(new ArrayList<>(List.of(n,node)));
                }
                else{
                    if(parent!=n){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][]adjacency={
                {},
                {2,3},
                {1,5,6},
                {1,4,7},
                {3,8},
                {2},
                {2},
                {3,8},
                {7,4}
        };
        CycleInUndirectedGraphBFS bfs=new CycleInUndirectedGraphBFS();
        System.out.println(bfs.cycle(adjacency));
    }
}
