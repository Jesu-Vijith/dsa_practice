package RecursionLeetcode;

public class L_79_WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][]visited=new boolean[board.length][board[0].length];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]==word.charAt(0) && ifWordExist(board,word,row,col,1,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean ifWordExist(char[][]board,String word, int row,int col,int wordIdx,boolean[][]visited){
        if(wordIdx==word.length()-1){
            return true;
        }
        visited[row][col]=true;
        int[] rowCell={-1,0,1,0};
        int[] colCell={0,1,0,-1};
        for(int i=0;i<4;i++){
            int tempRow=rowCell[i]+row;
            int tempCol=colCell[i]+row;
            if(tempRow>=0 && tempRow<board.length && tempCol>=0 && tempCol<board[0].length){
                char ch=board[tempRow][tempCol];
                if(ch==word.charAt(wordIdx) && !visited[tempRow][tempCol]){
                    System.out.println(ch);
                    return ifWordExist(board,word,tempRow,tempCol,wordIdx+1,visited);
                }
            }
        }
        visited[row][col]=false;
        return false;
    }

    public static void main(String[] args) {
        L_79_WordSearch search=new L_79_WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(search.exist(board,word));
    }
}
