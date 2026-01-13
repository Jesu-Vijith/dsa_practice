package Graphs.LeetCode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class L_1091_ShortestPathInBinaryMatrix {
    static class Pair{
        int brow;
        int bcol;
        Pair(int brow,int bcol){
            this.brow=brow;
            this.bcol=bcol;
        }
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Pair>pq=new LinkedList<>();
        if(grid[0][0]!=0 ||grid[grid.length-1][grid[0].length-1]!=0 )return -1;
        pq.add(new Pair(0, 0));
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        visited[0][0]=true;
        int[]rowCells={-1,0,1,0,-1,-1,1,1};
        int[]colCells={0,1,0,-1,-1,1,-1,1};
        int shortestPath=1;
        while(!pq.isEmpty()){
            int size=pq.size();
            for(int s=0;s<size;s++) {
                Pair p = pq.poll();
                int row = p.brow;
                int col = p.bcol;
                if (row == grid.length - 1 && col == grid[0].length - 1) return shortestPath;
                for (int i = 0; i < 8; i++) {
                    int rowCell = row + rowCells[i];
                    int colCell = col + colCells[i];
                    if (rowCell >= 0 && rowCell < grid.length && colCell >= 0 && colCell < grid[0].length) {
                        if (grid[rowCell][colCell] == 0 && !visited[rowCell][colCell]) {
                            pq.add(new Pair(rowCell, colCell));
                            visited[rowCell][colCell] = true;
                        }
                    }
                }
            }
            shortestPath++;
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[][]grid = {{0,0,0},{1,1,0},{1,1,0}};
//        int[][]grid={{0,1},{1,0}};
        int[][]grid={
                        {0,1,1,0,0,0},
                        {0,1,0,1,1,0},
                        {0,1,1,0,1,0},
                        {0,0,0,1,1,0},
                        {1,1,1,1,1,0},
                        {1,1,1,1,1,0}
        };
        L_1091_ShortestPathInBinaryMatrix l1=new L_1091_ShortestPathInBinaryMatrix();
        System.out.println(l1.shortestPathBinaryMatrix(grid));
    }

    public int shortestPathBinaryMatrix1(int[][] grid) {
        int n = grid.length;

        // Step 1: Handle impossible starting and ending cases
        // If start OR end cell is blocked, no path exists
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;

        // Special case: If it's a single cell and it's open, we are already at the destination
        if (n == 1) return 1;

        // Step 2: All 8 possible directions we can move in
        // Each pair represents (rowChange, colChange)
        int[][] dirs = {
                {-1, -1}, {-1, 0}, {-1, 1}, // Top-left, Top, Top-right
                {0, -1},          {0, 1},   // Left,       Right
                {1, -1},  {1, 0}, {1, 1}    // Bottom-left, Bottom, Bottom-right
        };

        // Step 3: BFS setup
        // Queue stores {row, col, stepsSoFar}
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n]; // To avoid revisiting cells

        // Start BFS from (0,0) with 1 step
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        // Step 4: BFS loop
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1], dist = curr[2];

            // If we reached the destination, return the steps taken
            if (r == n - 1 && c == n - 1) return dist;

            // Try all 8 directions
            for (int[] d : dirs) {
                int nr = r + d[0]; // New row
                int nc = c + d[1]; // New col

                // Check boundaries, open cell, and not visited before
                if (nr >= 0 && nr < n && nc >= 0 && nc < n &&
                        grid[nr][nc] == 0 && !visited[nr][nc]) {

                    visited[nr][nc] = true;       // Mark as visited
                    q.offer(new int[]{nr, nc, dist + 1}); // Add to queue with updated distance
                }
            }
        }

        // Step 5: If BFS finishes without reaching destination → no path exists
        return -1;
    }
}
