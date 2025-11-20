package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectBipartiteGraphBFS {
    public boolean bfs(int[][] graph) {
        int[]color=new int[graph.length];
        Arrays.fill(color,-1);
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1 && !check(graph,color,i,queue)){
                return false;
            }
        }
        return true;
    }

    public boolean check(int[][]graph,int[]color,int k,Queue<Integer>queue){
        queue.add(0);
        color[k]=0;
        boolean colorFlag=true;
        while(!queue.isEmpty()){
            colorFlag=!colorFlag;
            int size=queue.size();
            for(int i=0;i<size;i++){
                int num=queue.poll();
                int[]adj=graph[num];
                for(int elem:adj){
                    if(color[elem]!=-1 && color[elem]==color[num]){
                        return false;
                    }
                    if(color[elem]==-1){
                        color[elem]=colorFlag?0:1;
                        queue.add(elem);
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[]args) {
        int[][]adjacency={{},{2},{1,3,6},{2,4},{3,5},{4,7,6},{2,5},{5}};
        DetectBipartiteGraphBFS biBfs=new DetectBipartiteGraphBFS();
        System.out.println(biBfs.bfs(adjacency));
    }
}
