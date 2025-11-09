package Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversalCode {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adjacency=new ArrayList<>();
        adjacency.add(new ArrayList<>(List.of(2,3)));
        adjacency.add(new ArrayList<>(List.of(1,5,6)));
        adjacency.add(new ArrayList<>(List.of(1,7,4)));
        adjacency.add(new ArrayList<>(List.of(3,8)));
        adjacency.add(new ArrayList<>(List.of(2)));
        adjacency.add(new ArrayList<>(List.of(2)));
        adjacency.add(new ArrayList<>(List.of(3,8)));
        adjacency.add(new ArrayList<>(List.of(7,4)));
        DFSTraversalCode d1=new DFSTraversalCode();
        boolean[]visited=new boolean[adjacency.size()+1];
        ArrayList<Integer>ans=new ArrayList<>();
        d1.depth(1,ans,visited,adjacency);
        System.out.println(ans);
    }

    public void depth(int node,ArrayList<Integer>list,boolean[]visited,ArrayList<ArrayList<Integer>>adjacency){
        list.add(node);
        visited[node]=true;
        for(int n:adjacency.get(node-1)){
            if(!visited[n]) {
                depth(n,list,visited,adjacency);
            }
        }
    }

//    public ArrayList<Integer> depth2(int node,boolean[]visited,ArrayList<ArrayList<Integer>>adjacency){
//        ArrayList<Integer>list1 = new ArrayList<>();
//        ArrayList<Integer>list2 = new ArrayList<>();
//        list1.add(node);
//        visited[node]=true;
//        for(int n:adjacency.get(node-1)){
//            if(!visited[n]) {
//                list2=depth(n,visited,adjacency);
//            }
//        }
//        list1.addAll(list2);
//        return list1;
//    }

}
