package Graphs.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

public class L_1020_NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int enclaves=0;
        boolean[][]visited=new boolean[m][n];
        Queue<Pair> queue=new LinkedList<>();
        for(int row=0; row<m;row++){
            for(int col=0;col<n;col++){
                if((row==0 || col==0 || row==m-1 || col==n-1) && grid[row][col]==1){
                    queue.add(new Pair(row,col));
                    visited[row][col]=true;
                }
                else if((row>0 && row<m-1 && col>0 && col<n-1) && grid[row][col]==1){
                    enclaves++;
                }
            }
        }
        int[]rowDir={-1,0,1,0};
        int[]colDir={0,-1,0,1};
        while(!queue.isEmpty()){
            Pair p=queue.poll();
            int row=p.row;
            int col=p.col;
            for(int i=0;i<4;i++){
                int trow=row+rowDir[i];
                int tcol=col+colDir[i];
                if((trow>0 && trow<m && tcol>0 && tcol<n) && grid[trow][tcol]==1 && !visited[trow][tcol]){
                    enclaves--;
                    visited[trow][tcol]=true;
                    queue.add(new Pair(trow,tcol));
                }
            }
        }
        return enclaves;
    }

    static void main() {
        L_1020_NumberOfEnclaves ans=new L_1020_NumberOfEnclaves();
        int[][]grid={{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
//        int[][]grid={{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(ans.numEnclaves(grid));
    }
}
