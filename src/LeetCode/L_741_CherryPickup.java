package LeetCode;

import java.util.Arrays;

public class L_741_CherryPickup {
    public int cherryPickup(int[][] grid) {
        boolean[][] visited =new boolean[grid.length][grid[0].length];
        for(boolean[]b:visited) Arrays.fill(b,false);
        int ans= pickup(grid,visited,0,0,grid.length);
        return visited[grid.length-1][grid.length-1]?ans:0;
    }

    public int pickup(int[][]grid,boolean[][]visited,int row,int col,int n){
        if(col>=n || row>=n || visited[row][col] || grid[row][col]==-1)return 0;
        if(row==n-1 && col==n-1){
            if(grid[row][col]==1){
                visited[row][col]=true;
                return 1;
            }
            visited[row][col]=true;
            return 0;
        }
        int right=pickup(grid,visited,row,col+1,n);
        int down=pickup(grid,visited,row+1,col,n);
        int ans=right+down+grid[row][col];
        visited[row][col]=true;
        return ans;
    }

    public static void main(String[] args) {
        int[][]grid={{0,1,1,0,0},{1,1,1,1,0},{-1,1,1,1,-1},{0,1,1,1,0},{1,0,-1,0,0}};
        L_741_CherryPickup l1=new L_741_CherryPickup();
        System.out.println(l1.cherryPickup(grid));
    }
}
