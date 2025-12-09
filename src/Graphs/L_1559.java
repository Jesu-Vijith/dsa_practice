

public class L_1559{
    public boolean containsCycle(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                boolean ans=dfs(grid,visited,row,col,grid[row][col],row,col);
                visited[row][col]=false;
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][]grid,boolean[][]visited,int row,int col,char ch,int prow,int pcol) {
        if(visited[row][col] && grid[row][col]==ch && prow==row && pcol==col){
            return true;
        }
        if(prow==row && pcol==col){
            return false;
        }
        visited[row][col]=true;
        int[]rowDir={-1,0,1,0};
        int[]colDir={0,-1,0,1};
        for(int i=0;i<4;i++){
            int trow=row+rowDir[i];
            int tcol=col+colDir[i];
            if(trow>=0 && trow< grid.length && tcol>=0 && tcol<grid[0].length && grid[trow][tcol]==ch && !visited[trow][tcol]){
//                if(prow!=row && pcol!=col){
//                    return true;
//                }
                if(dfs(grid,visited,trow,tcol,ch,prow,pcol))return true;
            }
        }
        return false;
    }

    static void main() {
//        char[][]grid={{'a','a','a','a'},{'a','b','b','a'},{'a','b','b','a'},{'a','a','a','a'}};
//        char[][]grid={{'a','b','b'},{'b','z','b'},{'b','b','a'}};
        char[][]grid={{'d','b','b'},{'c','a','a'},{'b','a','c'},{'c','c','c'},{'d','d','a'}};
        L_1559 ans=new L_1559();
        System.out.println(ans.containsCycle(grid));
    }
}

