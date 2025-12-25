import java.util.*;

public class Dummy {
    public static void main(String[] args) {
        int[][]adjacency={
                {2,3},
                {2,4},
                {5},
                {5},
                {5,6},
                {7},
                {7},
                {}
        };
        Dummy d1=new Dummy();
//        System.out.println(d1.topologicalSortDfs(adjacency));
        System.out.println(d1.topologicalBfs(adjacency));
    }

    public List<Integer>topologicalBfs(int[][]adjacency){
        int[]inDegree=new int[adjacency.length];
        Queue<Integer> queue=new LinkedList<>();
        List<Integer>ansList=new ArrayList<>();
        for(int [] adj:adjacency){
            for(int elem:adj){
                inDegree[elem]++;
            }
        }
        System.out.println(Arrays.toString(inDegree));
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0)queue.add(i);
        }
        while(!queue.isEmpty()){
            int elem=queue.poll();
            ansList.add(elem);
            for(int num:adjacency[elem]){
                inDegree[num]--;
                if(inDegree[num]==0)queue.add(num);
            }
        }
        return ansList;
    }

    public List<Integer> topologicalSortDfs(int[][]adjacency){
        List<Integer>ansList=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        boolean[]visited=new boolean[adjacency.length];
        for(int i=0;i<adjacency.length;i++){
            if(!visited[i]){
                dfs(i,adjacency,stack,visited);
            }
        }
        while(!stack.isEmpty()){
            ansList.add(stack.pop());
        }
        return ansList;
    }

    public void dfs(int node,int[][]adjacency,Stack<Integer>stack,boolean[]visited){
        visited[node]=true;
        int[]adj=adjacency[node];
        for(int elem:adj){
            if(!visited[elem])dfs(elem,adjacency,stack,visited);
        }
        stack.add(node);
    }
}
