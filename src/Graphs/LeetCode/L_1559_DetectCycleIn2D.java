package Graphs.LeetCode;

public class L_1559_DetectCycleIn2D {
    public boolean containsCycle(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(!visited[row][col]) {
                    char ch = grid[row][col];
                    boolean ans = dfs(grid, visited, row, col, ch, grid[row][col]);
                    System.out.println(ans);
                    if (ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public boolean dfs(char[][]grid,boolean[][]visited,int row,int col,char ch,int parent){
        if(visited[row][col]){
            return true;
        }
        visited[row][col]=true;
        boolean right=false;
        boolean left=false;
        boolean top=false;
        boolean bottom=false;

        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited[row].length;j++) {
                System.out.print(visited[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        if(col+1<grid[0].length && !visited[row][col+1] && grid[row][col+1]==ch){
            right=dfs(grid,visited,row,col+1,ch,parent);
            if(right) return true;
        }
        if(col-1>=0 && !visited[row][col-1] && grid[row][col-1]==ch){
            left=dfs(grid,visited,row,col-1,ch,parent);
            if(left) return true;
        }
        if(row+1<grid.length && !visited[row+1][col] && grid[row+1][col]==ch){
            bottom=dfs(grid,visited,row+1,col,ch,parent);
            if(bottom)return true;
        }
        if(row-1>=0 && !visited[row-1][col] && grid[row-1][col]==ch){
            top=dfs(grid,visited,row-1,col,ch,parent);
            if(top)return true;
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
