package Graphs;

public class NQueen1 {
    public void solveNQueens(int n) {
        boolean[][]board=new boolean[n][];
        for(int i =0;i<n;i++) {
            board[i] = new boolean[n];
        }
        int row=0,col=0;
        while(col<n){
            backtrack(row,col,board,n);
            col++;
        }
    }

    public void backtrack(int r,int c,boolean[][]board,int n){
        if(r>=n || c>=n){
            for(boolean[]b :board){
                for(boolean bool :b){
                    System.out.print(bool+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        boolean right=right(r,c+1,board,n);
        boolean left=left(r,c-1,board,n);
        boolean top=top(r-1,c,board,n);
        boolean bottom=bottom(r+1,c,board,n);
        boolean diagonal=diagonal(r,c,board,n);
        if(left && right && top && bottom && diagonal){
            board[r][c]=true;
            backtrack(r+1,0,board,n);
            board[r][c]=false;
        }
        else{
            backtrack(r,c+1,board,n);
        }
    }

    public boolean left(int r,int c,boolean[][]board,int n){
        if(c<0){
            return true;
        }
        if(!board[r][c]){
            return left(r,c-1,board,n);
        }
        else{
            return false;
        }
    }

    public boolean right(int r,int c,boolean[][]board,int n){
        if(c==n){
            return true;
        }

        if(!board[r][c]){
            return right(r,c+1,board,n);
        }
        else{
            return false;
        }
    }

    public boolean top(int r,int c,boolean[][]board,int n){
        if(r<0){
            return true;
        }
        if(!board[r][c]){
            return top(r-1,c,board,n);
        }
        else{
            return false;
        }
    }
    public boolean bottom(int r,int c,boolean[][]board,int n){
        if(r==n){
            return true;
        }

        if(!board[r][c]){
            return bottom(r+1,c,board,n);
        }
        else{
            return false;
        }
    }

    public boolean diagonal(int r,int c,boolean[][]board,int n){
        boolean lb=leftBottom(r+1,c-1,board,n);
        boolean lt=leftTop(r-1,c-1,board,n);
        boolean rb=rightBottom(r+1,c+1,board,n);
        boolean rt=rightTop(r-1,c+1,board,n);
        return lb && lt && rb && rt;
    }

    public boolean leftBottom(int r,int c,boolean[][]board,int n){
        if(r==n || c<0){
            return true;
        }

        if(!board[r][c]){
            return leftBottom(r+1,c-1,board,n);
        }
        else{
            return false;
        }
    }

    public boolean leftTop(int r,int c,boolean[][]board,int n){
        if(r<0 || c<0){
            return true;
        }

        if(!board[r][c]){
            return leftTop(r-1,c-1,board,n);
        }
        else{
            return false;
        }
    }

    public boolean rightTop(int r,int c,boolean[][]board,int n){
        if(r<0 || c<n){
            return true;
        }

        if(!board[r][c]){
            return rightTop(r-1,c+1,board,n);
        }
        else{
            return false;
        }
    }

    public boolean rightBottom(int r,int c,boolean[][]board,int n){
        if(r<n || c==n){
            return true;
        }

        if(!board[r][c]){
            return rightBottom(r+1,c+1,board,n);
        }
        else{
            return false;
        }
    }


    static void main(String[]args) {
        NQueen1 n=new NQueen1();
        n.solveNQueens(4);
    }
}
