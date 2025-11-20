package Graphs;

public class DetectCycleDirectedGraphDFS {
    public static void main(String[] args) {
        int[][]adjacency={{},{2},{3},{4,6},{5},{},{5,7},{},{9},{10},{8}};
        DetectCycleDirectedGraphDFS d1=new DetectCycleDirectedGraphDFS();
        System.out.println(d1.cycle(adjacency));
    }
    public boolean cycle(int[][]adjacency){
        boolean[] visited=new boolean[adjacency.length];
        boolean[] pathVisited=new boolean[adjacency.length];
        for(int i=1;i<adjacency.length;i++){
            if(!visited[i]){
                if(dfs(adjacency,visited,pathVisited,i))return true;
            }
        }
        return false;
    }
    public boolean dfs(int[][]adjacency,boolean[]visited,boolean[]pathVisited,int node){
        if(pathVisited[node])return false;
        visited[node]=true;
        pathVisited[node]=true;
        int[]adj=adjacency[node];
        for (int elem:adj){
            if(pathVisited[elem])return true;
            if(dfs(adjacency,visited,pathVisited,elem))return true;
        }
        pathVisited[node]=false;
        return false;
    }

}
