import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Cells{
    int row;
    int col;
    int height;
    public Cells(int row, int col, int height){
        this.row=row;
        this.col=col;
        this.height=height;
    }
}

public class L_1765_MapOfHighestPeak {
    public int[][] highestPeak(int[][] isWater) {
        int[][] heights = new int[isWater.length][isWater[0].length];
        boolean[][] visited = new boolean[isWater.length][isWater[0].length];
        Queue<Cells> queue = new LinkedList<>();
        for (int row = 0; row < isWater.length; row++) {
            for (int col = 0; col < isWater[row].length; col++) {
                if (isWater[row][col] == 1) {
                    visited[row][col] = true;
                    queue.add(new Cells(row, col, 0));
                }
            }
        }
        int[] rowDir = {-1, 0, 1, 0};
        int[] colDir = {0, 1, 0, -1};
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Cells c = queue.poll();
                int row = c.row;
                int col = c.col;
                int height = c.height;
                heights[row][col] = height;
                for (int j = 0; j < 4; j++) {
                    int nRow = row + rowDir[j];
                    int nCol = col + colDir[j];
                    if (nRow >= 0 && nRow < isWater.length && nCol >= 0 && nCol < isWater[0].length && !visited[nRow][nCol]) {
                        visited[nRow][nCol] = true;
                        queue.add(new Cells(nRow, nCol, height+1));
                    }
                }
                for(boolean[]temp:visited){
                    for(boolean elem:temp){
                        System.out.print(elem+" ");
                    }
                    System.out.println();
                }
            }
        }
        return heights;
    }

    static void main() {
        int[][]isWater ={{0,0,1},{1,0,0},{0,0,0}};
        L_1765_MapOfHighestPeak ans=new L_1765_MapOfHighestPeak();
        int[][]ansArr=ans.highestPeak(isWater);
        for(int[]temp:ansArr){
            for(int elem:temp){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}
