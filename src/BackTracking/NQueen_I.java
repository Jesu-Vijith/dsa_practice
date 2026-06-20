package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen_I {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output=new ArrayList<>();
        if(n==1){
            output.add(new ArrayList(Arrays.asList("Q")));
            return output;
        }
        char[][]board=new char[n][n];
        for(char[]b:board){
            Arrays.fill(b,'.');
        }
        solve(output,board,n,0);
        return output;
    }

    public void solve(List<List<String>> output, char[][]board,int n, int row){
        if(row==n){
            List<String> list=new ArrayList<>();
            for(char[]b:board){
                list.add(new String(b));
            }
            output.add(list);
            return;
        }

        for(int col=0;col<n;col++){
            if(check(board,row,col,n)){
                board[row][col]='Q';
                solve(output,board,n,row+1);
                board[row][col]='.';
            }
        }
    }


    public boolean check(char[][]board,int row,int col,int n){
        //top
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q')return false;
        }

        //topleftDiagonal
        for(int r=row,c=col; c>=0 && r>=0 ; c--,r--){
            if(board[r][c]=='Q')return false;
        }

        //toprightDiagonal
        for(int r=row,c=col; r>=0 && c<n ; c++,r--){
            if(board[r][c]=='Q')return false;
        }

        return true;
    }

    public static void main(String[] args) {
        NQueen_I q1=new NQueen_I();
        System.out.println(q1.solveNQueens(4));
    }
}
