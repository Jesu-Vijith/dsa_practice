package Graphs.GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Pair{
    int v;
    int wt;
    public Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
}

//Right approach using toposort DFS
public class ShortestPathInDAG {
    public static void main(String[] args) {
        int V = 10, E = 24;
        int[][]edges = {{0,1,2}, {0,4,1}, {4,5,4}, {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}};

        ShortestPathInDAG s1=new ShortestPathInDAG();
        System.out.println(Arrays.toString(s1.shortestPath(V,E,edges)));
    }

    public int[] shortestPath(int V,int E,int[][]edges){
        List<Integer> ans=new ArrayList<>();
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>(2));
        }
        for(int[]elem:edges){
            int u=elem[0];
            int v=elem[1];
            int wt=elem[2];
            adj.get(u).add(new Pair(v,wt));
        }
          boolean[]visited=new boolean[V];
          Stack<Integer>stack=new Stack<>();
          for(int i=0;i<V;i++){
              if(!visited[i]){
                  dfs(i,visited,adj,stack);
              }
          }
          int [] distance=new int[V];
          Arrays.fill(distance,Integer.MAX_VALUE);
          distance[0]=0;
          ans.add(0);
          while(!stack.isEmpty()) {
              int node = stack.pop();
              if (distance[node] != Integer.MAX_VALUE) {
                  for (Pair p : adj.get(node)) {
                      distance[p.v] = Math.min(
                              distance[p.v],
                              distance[node] + p.wt
                      );
                  }
              }
          }
        for(int i=1;i<V;i++){
            if(distance[i]==Integer.MAX_VALUE)ans.add(-1);
            else ans.add(distance[i]);
        }
          return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public void dfs(int node,boolean[]visited,List<List<Pair>>adj,Stack<Integer>stack){
        visited[node]=true;
        List<Pair>pair=adj.get(node);
        for(Pair p:pair){
            if(!visited[p.v]){
                dfs(p.v,visited,adj,stack);
            }
        }
        stack.add(node);
    }
}
