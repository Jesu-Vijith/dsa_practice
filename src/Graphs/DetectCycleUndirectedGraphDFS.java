public class DetectCycleUndirectedGraphDFS {
    static void main() {
        int[][]adjacency={
                {},
                {2,3},
                {1,5},
                {4,1,6},
                {3},
                {2,7},
                {3,7},
                {5,6}
        };
        DetectCycleUndirectedGraphDFS d1=new DetectCycleUndirectedGraphDFS();
        System.out.println(d1.isCycle(adjacency));
    }

    public boolean isCycle(int[][]adjacency){
        boolean[]visited=new boolean[adjacency.length];
        for(int i=1;i<adjacency.length;i++){
            if(!visited[i]){
                if(dfs(adjacency,visited,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int[][]adjacency,boolean[]visited,int node,int parent){
        visited[node]=true;
        for(int n:adjacency[node]){
            if(!visited[n]){
                if(dfs(adjacency,visited,n,node))return true;
//                return dfs(adjacency,visited,n,node);
            }
            else{
                if(n!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}
