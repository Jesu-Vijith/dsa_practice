package Graphs.LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L_1631_PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {

        class Cell {
            int row;
            int col;
            int ht;

            Cell(int row, int col, int ht) {
                this.row = row;
                this.col = col;
                this.ht = ht;
            }

        }
        PriorityQueue<Cell>pq=new PriorityQueue<>(Comparator.comparing((Cell c)->c.ht));
        boolean [][]visited=new boolean[heights.length][heights[0].length];
        pq.add(new Cell(0,0,heights[0][0]));
        visited[0][0]=true;
        int [] rowCells={-1,0,1,0};
        int [] colCells={0,1,0,-1};
        int ansHeight=0;
        System.out.println(heights[0].length);
        System.out.println(2<heights[0].length);
        while(!pq.isEmpty()){
            Cell c=pq.poll();
            int row=c.row;
            int col=c.col;
            int height=c.ht;
            ansHeight=Math.max(height,ansHeight);
            if(row==heights.length-1 && col==heights[0].length-1){
                return ansHeight;
            }
            for(int i=0;i<4;i++){
                int cRow=row+rowCells[i];
                int cCol=col+colCells[i];
                if(cRow>=0 && cRow<heights.length && cCol>=0 && cCol<heights[0].length && !visited[cRow][cCol]){
                    int absHeight=Math.abs(heights[cRow][cCol]-heights[row][col]);
                    if(absHeight>=ansHeight){
                        pq.add(new Cell(cRow,cCol,absHeight));
                    }
                }
            }
        }
        return ansHeight;
    }

    public static void main(String[] args) {
        L_1631_PathWithMinimumEffort ans=new L_1631_PathWithMinimumEffort();
        int[][]heights = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(ans.minimumEffortPath(heights));
    }
}
