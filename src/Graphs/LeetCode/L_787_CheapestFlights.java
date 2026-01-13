package Graphs.LeetCode;

import java.util.*;

public class L_787_CheapestFlights {
    static class Pair{
        int node;
        int cost;
        int steps;
        Pair(int node,int cost,int steps){
            this.node=node;
            this.cost=cost;
            this.steps=steps;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<List<Integer>>>adjacency=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int[]flight:flights){
            int u=flight[0];
            int v=flight[1];
            int c=flight[2];
            adjacency.get(u).add(new ArrayList<>(Arrays.asList(v,c)));
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.comparing((Pair p)->p.steps)
                .thenComparing((p)->p.cost));
        pq.add(new Pair(src,0,0));
        if(adjacency.get(src).isEmpty())return -1;
        int[]costs=new int[n];
        Arrays.fill(costs,Integer.MAX_VALUE);
        costs[src]=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int node=p.node;
            int cost=p.cost;
            int steps=p.steps;
            List<List<Integer>>adj=adjacency.get(node); 
            for(List<Integer>pair:adj){
                int edgeNode=pair.get(0);
                int edgeCost=pair.get(1);
                int totalCost=edgeCost+cost;
                if(totalCost<costs[edgeNode] && edgeNode==dst && steps<=k){
                    costs[edgeNode]=totalCost;
                }
                else if(totalCost<costs[edgeNode] && edgeNode!=dst){
                    costs[edgeNode]=totalCost;
                    pq.add(new Pair(edgeNode,totalCost,steps+1));
                }
            }
        }
        return costs[dst]==Integer.MAX_VALUE?-1:costs[dst];
    }

    public static void main(String[] args) {
//        int n = 4, src = 0, dst = 3, k = 1;
//        int[][]flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int n = 3, src = 1, dst = 2, k = 1;
        int[][]flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        L_787_CheapestFlights c1=new L_787_CheapestFlights();
        System.out.println(c1.findCheapestPrice(n,flights,src,dst,k));
    }
}
