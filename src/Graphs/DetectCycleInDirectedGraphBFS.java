package Graphs;

import java.util.*;

public class DetectCycleInDirectedGraphBFS {
    static void main() {
        int[][]adjacency={{},{},{3},{1},{0,1},{0,2}};
        int[]inDegree=new int[adjacency.length];
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<adjacency.length;i++){
            for(int elem:adjacency[i]) {
                inDegree[elem]++;
            }
        }
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        DetectCycleInDirectedGraphBFS d1=new DetectCycleInDirectedGraphBFS();
        System.out.println(d1.bfs(adjacency,inDegree,queue));
    }

    public boolean bfs(int[][]adjacency, int[]inDegree,Queue<Integer>queue){
        List<Integer>list=new ArrayList<>();
        while(!queue.isEmpty()){
            int node=queue.poll();
            list.add(node);
            int []adj=adjacency[node];
            for(int elem:adj){
                inDegree[elem]--;
                if(inDegree[elem]==0){
                    queue.add(elem);
                }
            }
        }
        System.out.println(list.size());
        System.out.println(inDegree.length);
        return list.size() == inDegree.length;
    }

}
