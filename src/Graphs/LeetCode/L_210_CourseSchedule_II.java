package Graphs.LeetCode;

import java.util.*;

public class L_210_CourseSchedule_II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]finished=new int[numCourses];
        boolean[]visited=new boolean[numCourses];
        Queue<Integer> queue=new LinkedList<>();
        for(int[]adj:prerequisites){
            finished[adj[0]]++;
        }
        for(int i=0;i<finished.length;i++){
            if(finished[i]==0){
                visited[i]=true;
                queue.add(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            int node=queue.poll();
            list.add(node);
            for(int[]adj:prerequisites){
                if(adj[1]==node){
                    finished[adj[0]]--;
                    if(finished[adj[0]]==0 && !visited[adj[0]]) {
                        queue.add(adj[0]);
                        visited[adj[0]]=true;
                    }
                }
            }
        }
        return list.size()==numCourses?list.stream()
                .mapToInt(Integer::intValue)
                .toArray():
                new int[0];
    }

    public static void main(String[] args) {
        int numCourses = 3;
        int[][]prerequisites = {{1,0},{1,2},{0,1}};
        L_210_CourseSchedule_II  l1=new L_210_CourseSchedule_II();
        System.out.println(Arrays.toString(l1.findOrder(numCourses,prerequisites)));
    }
}
