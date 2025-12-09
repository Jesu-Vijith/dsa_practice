public class DetectCycleInDirectedGraphDFS {
    static void main() {
        int[][]adjacency={{},{2},{3},{4,7},{5},{6},{},{5},{9},{10},{8}};
        DetectCycleInDirectedGraphDFS d1=new DetectCycleInDirectedGraphDFS();
        System.out.println(d1.isCycle(adjacency));
    }

    public boolean isCycle(int[][]adjacency){
        boolean[]visited=new boolean[adjacency.length];
        boolean[]pathVisited=new boolean[adjacency.length];
        for(int i=1;i<adjacency.length;i++){
            if(!visited[i]){
                if(dfs(adjacency,visited,pathVisited,i)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int[][]adjacency,boolean[]visited,boolean[]pathVisited,int node){
        if(pathVisited[node])return true;
        if(visited[node])return false;

        visited[node]=true;
        pathVisited[node]=true;
        int[]adj=adjacency[node];
        for(int elem:adj){
            if(dfs(adjacency,visited,pathVisited,elem)){
                return true;
            }
        }
        pathVisited[node]=false;
        return false;
    }
}
