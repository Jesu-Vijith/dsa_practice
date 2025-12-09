import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {
    static void main() {
        int[][]adjacency={{},{},{3},{1},{0,1},{2,0}};
        TopologicalSortDFS t1=new TopologicalSortDFS();
        System.out.println(t1.topological(adjacency));
    }
    public List<Integer> topological(int[][]adjacency){
        boolean[]visited=new boolean[adjacency.length];
        Stack<Integer>stack=new Stack<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<adjacency.length;i++){
            if(!visited[i])dfs(adjacency,visited,stack,i);
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    public void dfs(int[][]adjacency,boolean[]visited,Stack<Integer>stack,int node){
        visited[node]=true;
        int[]adj=adjacency[node];
        for(int elem:adj){
            if(!visited[elem])dfs(adjacency,visited,stack,elem);
        }
        stack.push(node);
    }
}
