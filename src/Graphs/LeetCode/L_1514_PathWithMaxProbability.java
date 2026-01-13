package Graphs.LeetCode;

import java.util.*;

public class L_1514_PathWithMaxProbability {

    class Pair{
        int node;
        double probability;
        Pair(int node,double probability){
            this.node=node;
            this.probability=probability;
        }
    }

    public double maxProbability1(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<double[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(new double[]{v, succProb[i]});
            adj.get(v).add(new double[]{u, succProb[i]});
        }

        double[] dis = new double[n];
        Arrays.fill(dis, 0.0);
        dis[start_node] = 1.0;

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.add(new double[]{start_node, 1.0});

        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            int node = (int) cur[0];
            double d = cur[1];
            if(dis[node] > d) continue;
            for (double[] nbr : adj.get(node)) {
                int next = (int) nbr[0];
                double wt = nbr[1];
                if (d * wt > dis[next]) {
                    dis[next] = d * wt;
                    pq.add(new double[]{next, dis[next]});
                }
            }
        }
        return dis[end_node] == Double.MIN_VALUE ? 0 : dis[end_node];
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<double[]>>adjacency=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int[]edge=edges[i];
            int u=edge[0];
            int v=edge[1];
            double prob=succProb[i];
            adjacency.get(u).add(new double[]{v,prob});
            adjacency.get(v).add(new double[]{u,prob});
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.comparing((Pair p)->p.probability).reversed());
        pq.add(new Pair(start_node,1d));
        double[]probArr=new double[n];
        Arrays.fill(probArr,Integer.MIN_VALUE);
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
            double currentProb=pair.probability;
            List<double[]>adj=adjacency.get(pair.node);
            for(double[]p:adj){
                int adjNode=(int)p[0];
                double adjProb=p[1];
                if(currentProb*adjProb>probArr[adjNode]){
                    probArr[adjNode]=currentProb*adjProb;
                    pq.add(new Pair(adjNode,probArr[adjNode]));
                }
            }
        }
        return probArr[end_node];
    }

    public static void main(String[] args) {
        int n = 3, start = 0, end = 2;
        int[][]edges = {{0,1},{1,2},{0,2}};
        double[]succProb = {0.5,0.5,0.2};
        L_1514_PathWithMaxProbability l1=new L_1514_PathWithMaxProbability();
        System.out.println(l1.maxProbability(n,edges,succProb,start,end));
        System.out.println(l1.maxProbability1(n,edges,succProb,start,end));
    }
}
