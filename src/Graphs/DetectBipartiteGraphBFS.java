import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectBipartiteGraphBFS {
    public boolean bfs(int[][]adjacency){
        Queue<Integer> queue=new LinkedList<>();
        int[]color=new int[adjacency.length];
        Arrays.fill(color,-1);
        queue.add(1);
        color[1]=0;
        boolean colorFlag=false;
        while(!queue.isEmpty()){
            int num=queue.poll();
            int[]adj=adjacency[num];
            for(int elem:adj){
                if(color[elem]!=-1 && color[num]==color[elem]){
                    return false;
                }
                if(color[elem]==-1){
                    color[elem]=colorFlag?0:1;
                    colorFlag=!colorFlag;
                    queue.add(elem);
                }
            }
        }
        return true;
    }


    static void main() {
        int[][]adjacency={{},{2},{1,3,5},{2,4},{3,5,6},{2,4},{4}};
        DetectBipartiteGraphBFS biBfs=new DetectBipartiteGraphBFS();
        System.out.println(biBfs.bfs(adjacency));
    }
}
