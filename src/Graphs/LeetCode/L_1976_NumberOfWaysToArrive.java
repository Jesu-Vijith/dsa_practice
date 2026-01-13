package Graphs.LeetCode;

import java.util.*;

public class L_1976_NumberOfWaysToArrive {

    class Pair{
        int node;
        long time;
        Pair(int node,long time){
            this.node=node;
            this.time=time;
        }
    }
    public int countPaths(int n,int[][]roads){
        int Mod=10000007;
        List<List<long[]>>adjacency=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int [] road :roads){
            int u=road[0];
            int v=road[1];
            int t=road[2];
            adjacency.get(u).add(new long[]{v,t});
            adjacency.get(v).add(new long[]{u,t});
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.comparing((Pair p)->p.time));
        pq.add(new Pair(0,0));
        long[]times=new long[n];
        Arrays.fill(times,Long.MAX_VALUE);
        times[0]=0;
        int []pathWays=new int[n];
        pathWays[0]=1;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int node=p.node;
            long time=p.time;
            if(time>times[node]){
                continue;
            }
            List<long[]>adj=adjacency.get(node);
            for(long[]arr:adj){
                int edgeNode=(int)arr[0];
                long edgeTime=arr[1];
                long totalTime=edgeTime+time;
                if(totalTime<times[edgeNode]){
                    times[edgeNode]=totalTime;
                    pathWays[edgeNode]=pathWays[node];
                    pq.add(new Pair(edgeNode,times[edgeNode]));
                }
                else if(totalTime==times[edgeNode]){
                    pathWays[edgeNode]=(pathWays[node]+pathWays[edgeNode])%Mod;
                }
            }
        }
        return pathWays[n-1];
    }

    public static void main(String[] args) {
        int  n = 7;
        int[][]roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
        L_1976_NumberOfWaysToArrive l1=new L_1976_NumberOfWaysToArrive();
        System.out.println(l1.countPaths(n,roads));
    }
}
