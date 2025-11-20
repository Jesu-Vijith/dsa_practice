package Graphs;

public class DetectCycleUndirectedGraphDFS {
    public static void main(String []args) {
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

//        int[][] adjacency = {
//                {},
//                {2, 3},
//                {1, 4},
//                {1, 5},
//                {2},
//                {3, 6},
//                {5}
//        };
        DetectCycleUndirectedGraphDFS d1=new DetectCycleUndirectedGraphDFS();
        System.out.println(d1.isCycle(adjacency));
    }

    public boolean isCycle(int[][]adjacency){
        boolean [] visited=new boolean[adjacency.length];
        for(int i=1;i<adjacency.length;i++) {
            if (!visited[i] && dfs(adjacency, visited,i, -1))return true;
        }
        return false;
    }

    public boolean dfs(int[][]adjacency,boolean[]visited,int node,int parent){
        visited[node]=true;
        for(int elem:adjacency[node]){
            if(!visited[elem]){
                if(dfs(adjacency,visited,elem,node))return true;
            }
            else if(elem!=parent){
                return true;
            }
        }
        return false;
    }
}
