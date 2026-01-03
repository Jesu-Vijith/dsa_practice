package Graphs.GFG;

import java.util.*;

public class ShortestPathInUndirectedGraph {
    public int[] shortestPath(int[][] edges, int N, int M) {
        int[]distance=new int[N];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        List<List<Integer>>adjacency=new ArrayList<>();
        for (int i=0;i<N;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            adjacency.get(edge[0]).add(edge[1]);
            adjacency.get(edge[1]).add(edge[0]);
        }
        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int node=queue.poll();
            List<Integer>adj=adjacency.get(node);
            for(int elem:adj){
                if(distance[node]+1 < distance[elem]){
                    distance[elem]=distance[node]+1;
                    queue.add(elem);
                }
            }
        }
        for(int i=0;i<N;i++){
            if(distance[i]==Integer.MAX_VALUE){
                distance[i]=-1;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        ShortestPathInUndirectedGraph s1=new ShortestPathInUndirectedGraph();
        int[][]edges={{1,0},{2,1},{0,3},{3,7},{3,4},{7,4},{7,6},{4,5},{4,6},{6,5}};
        int n=8,m=10;

//        int n = 9, m = 10;
//        int[][]edges ={{0,1},{0,3},{3,4},{4,5},{5, 6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        System.out.println(Arrays.toString(s1.shortestPath(edges,n,m)));
    }
}
