package BackTracking;

import java.util.Arrays;

public class NQueen_II_SampleTry {

    static int count=0;
    public int totalNQueens(int n) {
        char[][]board=new char[n][n];
        for(char[]ch:board){
            Arrays.fill(ch,'.');
        }
        total(board,n,0);
        return count;
    }

    public void total(char[][]board,int n,int row){
        if(row==n){
            count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(check(board,row,col,n)){
                board[row][col]='Q';
                total(board,n,row+1);
                board[row][col]='.';
            }
        }
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
        NQueen_II_SampleTry n2=new NQueen_II_SampleTry();
        System.out.println(n2.totalNQueens(4));
    }
}
