package Graphs.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

class Pair_L_130 {
    int row;
    int col;

    public Pair_L_130(int row, int col){
        this.row=row;
        this.col=col;
    }
}

public class L_130_SurroundedRegions {
    public void solve(char[][] board) {
        Queue<Pair_L_130>queue=new LinkedList<>();
        boolean[][]visited=new boolean[board.length][board[0].length];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                if((row==0 || row==board.length-1 || col==0 || col==board[0].length-1) && board[row][col]=='O'){
                    queue.add(new Pair_L_130(row,col));
                }
            }
        }
        int[]rowDir={-1,-0,1,0};
        int[]colDir={0,-1,0,1};
        while(!queue.isEmpty()){
            Pair_L_130 p=queue.poll();
            int row=p.row;
            int col=p.col;
            for(int i=0;i<4;i++){
                int trow=row+rowDir[i];
                int tcol=col+colDir[i];
                if(trow>0 && trow<board.length-1 && tcol>0 && tcol<board[0].length-1 && board[trow][tcol]!='X' && !visited[trow][tcol]){
                    queue.add(new Pair_L_130(trow,tcol));
                    visited[trow][tcol]=true;
                }
            }
        }
        for(int row=1;row<board.length-1;row++){
            for(int col=1;col<board[row].length-1;col++){
                if(!visited[row][col]){
                    board[row][col]='X';
                }
            }
        }
    }

    static void main() {
        char[][]board={{'X','O','X'},{'X','O','X'},{'X','O','X'}};
        L_130_SurroundedRegions ans=new L_130_SurroundedRegions();
        ans.solve(board);
        for(char[] row:board){
            for (char ch:row){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}