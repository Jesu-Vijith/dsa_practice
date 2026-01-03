package Graphs.LeetCode;

import java.util.*;

public class L_743_NetWorkDelayTime {
    static class Pair{
        int node;
        int time;
        Pair(int node,int time){
            this.node=node;
            this.time=time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<List<Integer>>>adjacency=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int[]time:times){
            int u=time[0];
            int v=time[1];
            int t=time[2];
            adjacency.get(u).add(new ArrayList<>(Arrays.asList(v,t)));
        }
        int[]time=new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[k]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.comparing((Pair p)->p.time));
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int rootTime=p.time;
            List<List<Integer>>adj=adjacency.get(p.node);
            for(List<Integer>pair:adj){
                int adjNode=pair.get(0);
                int adjTime=pair.get(1);
                if(rootTime+adjTime<time[adjNode]){
                    time[adjNode]=rootTime+adjTime;
                    pq.add(new Pair(adjNode,time[adjNode]));
                }
            }
        }
        int output=0;
        for(int i=1;i<time.length;i++){
            if(time[i]==Integer.MAX_VALUE){
                return -1;
            }
            else if(time[i]>output){
                output=time[i];
            }
        }
        return output==0?-1:output;
    }

    public static void main(String[] args) {
        int[][]times={{1,2,1},{2,3,2},{1,3,1}};
        int n=3,k=2;
        L_743_NetWorkDelayTime d1=new L_743_NetWorkDelayTime();
        System.out.println(d1.networkDelayTime(times,n,k));
    }
}
