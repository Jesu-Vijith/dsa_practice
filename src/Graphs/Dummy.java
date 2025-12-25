package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

    public class Dummy {
        public static void main(String[]args) {
            int[][] adjacency = {
                    {1, 2},
                    {3},
                    {3},
                    {4},
                    {}
            };
            Queue<Integer> queue=new LinkedList<>();
            int[]inDegree=new int[adjacency.length];
            for(int[]adj:adjacency){
                for(int elem:adj){
                    inDegree[elem]++;
                }
            }
            for(int i=0;i<inDegree.length;i++){
                if(inDegree[i]==0){
                    queue.add(i);
                }
            }
            Dummy d1=new Dummy();
            System.out.println(d1.detectCycle(adjacency,queue,inDegree));
        }

        public boolean detectCycle(int[][]adjacency,Queue<Integer>queue,int[]inDegree){
            int count=0;
            while(!queue.isEmpty()){
                int node=queue.poll();
                count++;
                int[]adj=adjacency[node];
                for(int elem:adj) {
                    inDegree[elem]--;
                    if (inDegree[elem] == 0) {
                        queue.add(elem);
                    }
                }
            }
            return count != adjacency.length;
        }
    }
