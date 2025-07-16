package RecursionMaze;

public class Question5 {
    public static void main(String[] args) {
        boolean[][] maze={
                            {true,true,true},
                            {true,true,true},
                            {true,true,true}
                          };

        allDirections(maze,0,0,"");
    }

    static void allDirections(boolean[][] maze,int r,int c,String ans){
        if(r==2 && c==2){
            System.out.println(ans);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< 2){
            allDirections(maze,r+1,c,ans+"D");
        }
        if(c<2){
            allDirections(maze,r,c+1,ans+"R");
        }
        if(r>0){
            allDirections(maze,r-1,c,ans+"U");
        }
        if(c>0){
            allDirections(maze,r,c-1,ans+"L");
        }
        maze[r][c]=true;
    }
}
