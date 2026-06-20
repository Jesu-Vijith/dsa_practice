package BackTracking;

import java.util.Arrays;

public class NQueen_II {
    public int totalNQueens(int n) {
        char[][]board=new char[n][n];
        for(char[]ch:board){
            Arrays.fill(ch,'.');
        }
        return total(board,n,0);
    }

    public int total(char[][]board,int n,int row){
        if(row==n){
            return 1;
        }
        int ans=0;
        for(int col=0;col<n;col++){
            if(check(board,row,col,n)){
                board[row][col]='Q';
                ans+=total(board,n,row+1);
                board[row][col]='.';
            }
        }
        return ans;
    }

    public boolean check(char[][]board,int row,int col,int n){
        for(int r=row; r>=0;r--){
            if(board[r][col]=='Q')return false;
        }

        for(int r=row,c=col; r>=0 && c>=0 ; r--,c--){
            if(board[r][c]=='Q')return false;
        }

        for(int r=row,c=col; r>=0 && c<n ; r--,c++){
            if(board[r][c]=='Q')return false;
        }

        return true;

    }

    public static void main(String[] args) {
        NQueen_II n2=new NQueen_II();
        System.out.println(n2.totalNQueens(4));
    }
}