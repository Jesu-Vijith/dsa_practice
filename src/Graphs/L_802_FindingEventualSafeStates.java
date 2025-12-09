import java.util.ArrayList;
import java.util.List;

public class L_802_FindingEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer>list=new ArrayList<>();
        boolean[]visited=new boolean[graph.length];
        boolean[]pathVisited=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                dfs(graph,visited,pathVisited,i);
            }
        }
        for(int i=0;i<pathVisited.length;i++){
            if(!pathVisited[i]){
                list.add(i);
            }
        }
        return list;
    }

    public boolean dfs(int[][]graph,boolean[]visited,boolean[]pathVisited,int node){
        visited[node]=true;
        pathVisited[node]=true;
        int[]adj=graph[node];
        for(int elem:adj){
            if(pathVisited[elem]){
                return true;
            }
            if(elem==node){
                return false;
            }
            if(!visited[elem] && dfs(graph,visited,pathVisited,elem))return true;
        }
        pathVisited[node]=false;
        return false;
    }

    static void main() {
        L_802_FindingEventualSafeStates l1=new L_802_FindingEventualSafeStates();
        int[][]graph={{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(l1.eventualSafeNodes(graph));
    }
}
