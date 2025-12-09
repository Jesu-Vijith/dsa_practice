import java.util.*;

//stack -> [5, 2, 3, 4, 1, 0]
//queue -> [4, 5, 0, 2, 3, 1]

public class TopologicalSortBFS_KahnsAlgo {
    static void main() {
        int[][]adjacency={{},{},{3},{1},{0,1},{0,2}};
        int[] inDegree=new int[adjacency.length];
        for (int[] ints : adjacency) {
             for (int anInt : ints) {
                inDegree[anInt]++;
            }
        }
        System.out.println(Arrays.toString(inDegree));
        TopologicalSortBFS_KahnsAlgo k1=new TopologicalSortBFS_KahnsAlgo();
        System.out.println(k1.topological(adjacency,inDegree));
    }
    public List<Integer> topological(int[][]adjacency, int[]inDegree){
        Queue<Integer>queue=new LinkedList<>();
        List<Integer>list=new ArrayList<>();
        for (int i=0;i< adjacency.length;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int num=queue.peek();
            queue.poll();
            list.addLast(num);
            int[]adj=adjacency[num];
            for(int elem:adj){
                inDegree[elem]--;
                if(inDegree[elem]==0){
                    queue.add(elem);
                }
            }
        }

        System.out.println(Arrays.toString(inDegree));

        return list;

    }
}
