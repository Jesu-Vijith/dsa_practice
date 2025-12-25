package Graphs.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L_207_CourseSchedule_I {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]finished=new int[numCourses];
        Queue<Integer> queue=new LinkedList<>();
        for(int[]adj:prerequisites){
            finished[adj[0]]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            if(finished[i]==0){
                list.add(i);
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int[]adj:prerequisites){
                if(adj[1]==node){
                    finished[adj[0]]--;
                    if(finished[adj[0]]==0){
                        queue.add(adj[0]);
                        list.add(adj[0]);
                    }
                }
            }
        }
        return list.size()==numCourses;
    }

    public static void main(String[] args) {
        L_207_CourseSchedule_I l1=new L_207_CourseSchedule_I();
        int [][] preReq={{1,0},{0,1}};
        System.out.println(l1.canFinish(2,preReq));
    }
}
