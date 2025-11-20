package Graphs.LeetCode;

public class L_1559_DetectCycleIn2D {
    public boolean containsCycle(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(!visited[row][col]) {
                    char ch = grid[row][col];
                    boolean ans = dfs(grid, visited, row, col, ch, grid[row][col]);
                    if (ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][]grid,boolean[][]visited,int row,int col,char ch,int parent){
        if(visited[row][col] && grid[row][col]!=parent ){
            return true;
        }
        visited[row][col]=true;
        int[]rowDir={-1,0,1,0};
        int[]colDir={0,-1,0,1};
        for(int i=0;i<4;i++){
            int trow=row+rowDir[i];
            int tcol=col+colDir[i];
            if(trow>=0 && trow<grid.length && tcol>=0 && tcol<grid[0].length && !visited[trow][tcol]) {
                if (dfs(grid, visited, trow, tcol, ch, grid[trow][tcol])) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][]grid= {
                {'a', 'a', 'a', 'a'},
                {'a', 'b', 'b', 'a'},
                {'a', 'b', 'b', 'a'},
                {'a', 'a', 'a', 'a'}
        };
        L_1559_DetectCycleIn2D ans=new L_1559_DetectCycleIn2D();
        System.out.println(ans.containsCycle(grid));
    }
}
