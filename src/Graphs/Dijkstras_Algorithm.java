package Graphs;

import java.util.*;


public class Dijkstras_Algorithm {
    static class Pair{
        int node;
        int distance;
        public Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }
    }

    public int[] dijkstras(List<List<List<Integer>>>adjacency){
        List<Integer>outputDistance=new ArrayList<>();
        int[]distance=new int[adjacency.size()];
        PriorityQueue<Pair>pq=new PriorityQueue<>(Comparator.comparing((Pair p)->p.distance)
                .thenComparing(p->p.node));
        pq.add(new Pair(0,0));
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int dist=p.distance;
            List<List<Integer>>adj=adjacency.get(p.node);
            for(List<Integer>pair:adj){
                int adjNode=pair.get(0);
                int adjDistance=pair.get(1);
                if(adjDistance+dist<distance[adjNode]){
                    distance[adjNode]=adjDistance+dist;
                    pq.add(new Pair(adjNode,distance[adjNode]));
                }
            }
        }
        System.out.println(Arrays.toString(distance));
        return distance;
    }

    public static void main(String[] args) {
//        List<List<List<Integer>>>adjacency=new ArrayList<>();
//        for(int i=0;i<6;i++){
//            adjacency.add(new ArrayList<>());
//        }
//        adjacency.get(0).add(new ArrayList<>(Arrays.asList(1,4)));
//        adjacency.get(0).add(new ArrayList<>(Arrays.asList(2,4)));
//
//        adjacency.get(1).add(new ArrayList<>(Arrays.asList(0,4)));
//        adjacency.get(1).add(new ArrayList<>(Arrays.asList(2,2)));
//
//        adjacency.get(2).add(new ArrayList<>(Arrays.asList(0,4)));
//        adjacency.get(2).add(new ArrayList<>(Arrays.asList(1,2)));
//        adjacency.get(2).add(new ArrayList<>(Arrays.asList(3,3)));
//        adjacency.get(2).add(new ArrayList<>(Arrays.asList(4,1)));
//        adjacency.get(2).add(new ArrayList<>(Arrays.asList(5,6)));
//
//        adjacency.get(3).add(new ArrayList<>(Arrays.asList(2,3)));
//        adjacency.get(3).add(new ArrayList<>(Arrays.asList(5,2)));
//
//        adjacency.get(4).add(new ArrayList<>(Arrays.asList(2,1)));
//        adjacency.get(4).add(new ArrayList<>(Arrays.asList(5,3)));
//
//        adjacency.get(5).add(new ArrayList<>(Arrays.asList(3,2)));
//        adjacency.get(5).add(new ArrayList<>(Arrays.asList(4,3)));
//        adjacency.get(5).add(new ArrayList<>(Arrays.asList(2,6)));
//        List<List<List<Integer>>>adjacency=new ArrayList<>();

        List<List<List<Integer>>>adjacency=new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            adjacency.add(new ArrayList<>());
        }

// 0
        adjacency.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
        adjacency.get(0).add(new ArrayList<>(Arrays.asList(2, 5)));

// 1
        adjacency.get(1).add(new ArrayList<>(Arrays.asList(0, 2)));
        adjacency.get(1).add(new ArrayList<>(Arrays.asList(2, 1)));
        adjacency.get(1).add(new ArrayList<>(Arrays.asList(3, 3)));

// 2
        adjacency.get(2).add(new ArrayList<>(Arrays.asList(0, 5)));
        adjacency.get(2).add(new ArrayList<>(Arrays.asList(1, 1)));
        adjacency.get(2).add(new ArrayList<>(Arrays.asList(3, 2)));
        adjacency.get(2).add(new ArrayList<>(Arrays.asList(4, 4)));

// 3
        adjacency.get(3).add(new ArrayList<>(Arrays.asList(1, 3)));
        adjacency.get(3).add(new ArrayList<>(Arrays.asList(2, 2)));
        adjacency.get(3).add(new ArrayList<>(Arrays.asList(5, 6)));

// 4
        adjacency.get(4).add(new ArrayList<>(Arrays.asList(2, 4)));
        adjacency.get(4).add(new ArrayList<>(Arrays.asList(5, 1)));
        adjacency.get(4).add(new ArrayList<>(Arrays.asList(6, 7)));

// 5
        adjacency.get(5).add(new ArrayList<>(Arrays.asList(3, 6)));
        adjacency.get(5).add(new ArrayList<>(Arrays.asList(4, 1)));
        adjacency.get(5).add(new ArrayList<>(Arrays.asList(6, 2)));

// 6
        adjacency.get(6).add(new ArrayList<>(Arrays.asList(4, 7)));
        adjacency.get(6).add(new ArrayList<>(Arrays.asList(5, 2)));

        Dijkstras_Algorithm algo=new Dijkstras_Algorithm();
        System.out.println(Arrays.toString(algo.dijkstras(adjacency)));
    }
}
