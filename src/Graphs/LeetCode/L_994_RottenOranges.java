package Graphs.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

class Pair_L_944 {
    int row;
    int col;
    public Pair_L_944(int row, int col){
        this.row=row;
        this.col=col;
    }
}

public class L_994_RottenOranges {
    static Integer freshOrange=0;

    public int orangesRotting(int[][] grid) {
        Queue<Pair_L_944>queue=new LinkedList<>();
        boolean[][]rotten=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(grid[row][col]==2){
                    queue.add(new Pair_L_944(row,col));
                    rotten[row][col]=true;
                }
                if(grid[row][col]==1){
                    freshOrange++;
                }
            }
        }
        if(freshOrange==0){
            return 0;
        }
        int minutes=bfsRotten(grid,rotten,queue);
        return freshOrange>0?-1:minutes-1;
    }

    public int bfsRotten(int[][]grid,boolean[][]rotten,Queue<Pair_L_944>queue){
        int minutes=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Pair_L_944 pair=queue.poll();
                int row=pair.row;
                int col=pair.col;
                if(col-1>=0 && grid[row][col-1]==1 && !rotten[row][col-1]){
                    queue.add(new Pair_L_944(row,col-1));
                    rotten[row][col-1]=true;
                    freshOrange--;
                }
                if(col+1<grid[0].length && grid[row][col+1]==1 && !rotten[row][col+1]){
                    queue.add(new Pair_L_944(row,col+1));
                    rotten[row][col+1]=true;
                    freshOrange--;
                }
                if(row-1>=0 && grid[row-1][col]==1 && !rotten[row-1][col]){
                    queue.add(new Pair_L_944(row-1,col));
                    rotten[row-1][col]=true;
                    freshOrange--;
                }
                if(row+1<grid.length && grid[row+1][col]==1 && !rotten[row+1][col]){
                    queue.add(new Pair_L_944(row+1,col));
                    rotten[row+1][col]=true;
                    freshOrange--;
                }
            }
            minutes++;
        }
       return minutes;
    }
    static void main() {
        int[][]grid={
                {2,2},{1,1},{0,0},{2,0}
        };
        L_994_RottenOranges ans=new L_994_RottenOranges();
        System.out.println(ans.orangesRotting(grid));
    }
}
