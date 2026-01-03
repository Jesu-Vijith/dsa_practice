package Graphs.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//MY OWN APPROACH..NOT 100 % CORRECT
public class ShortestPathInDirectedAcyclicGraph {
    public static void main(String[] args) {
        int V = 6, E = 7;
        int[][]edges = {{0,1,2}, {0,4,1}, {4,5,4}, {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}};
        ShortestPathInDirectedAcyclicGraph s1=new ShortestPathInDirectedAcyclicGraph();
        System.out.println(s1.shortestPath(V,E,edges));
    }
    public List<Integer> shortestPath(int V, int E, int[][] edges) {
        List<Integer>list=new ArrayList<>();
        boolean[]visited=new boolean[V];
        list.add(0);
        for(int i=1;i<V;i++){
            int ans= dfs(0,i,visited,Integer.MAX_VALUE,0,edges);
            if(ans==Integer.MAX_VALUE)list.add(-1);
            else list.add(ans);
        }
//        return list.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
        return list;
    }
    public int dfs(int start,int end,boolean[]visited,int ans,int currentAns,int[][]edges){
        for(int[]adj:edges){
            if(adj[0]==start && adj[1]==end){
                currentAns+=adj[2];
                ans=Math.min(ans,currentAns);
                currentAns=0;
            }
            else if (adj[0]==start && !visited[adj[1]]) {
                visited[adj[1]]=true;
                ans=Math.min(ans,dfs(adj[1],end,visited,ans,currentAns+adj[2],edges));
            }
            visited[adj[1]]=false;
        }
        return ans;
    }
}
