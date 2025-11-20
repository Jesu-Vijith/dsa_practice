package Graphs.LeetCode;

public class L_200_NumberOfIslands {
    static void main() {
        char[][]grid={
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
                };
        L_200_NumberOfIslands l1=new L_200_NumberOfIslands();
        System.out.println(l1.numIslands(grid));
        }

    public int numIslands(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        int islands=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(!visited[row][col] && grid[row][col]=='1'){
                    islands++;
                    dfs(grid,visited,row,col);
                }
            }
        }
        return islands;
    }

    public void dfs(char[][]grid,boolean[][]visited,int row,int col){
        if(row<0 || row>grid.length-1 ||col<0 || col>grid[0].length-1){
            return;
        }
        if(visited[row][col] || grid[row][col]=='0'){
            return;
        }
        visited[row][col]=true;
        for(boolean[]i:visited){
            for(boolean j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        //left
        dfs(grid,visited,row,col-1);
        //right
        dfs(grid,visited,row,col+1);
        //top
        dfs(grid,visited,row-1,col);
//       bottom
        dfs(grid,visited,row+1,col);
    }

}
