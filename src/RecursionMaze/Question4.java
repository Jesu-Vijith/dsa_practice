package RecursionMaze;

public class Question4 {
    public static void main(String[] args) {
//        pathWithObstacles(3,3,"");
        boolean [][]maze={  {true,true,true},
                            {true,false,true},
                            {true,true,true}
                        };
        kunalsApproach(0,0,maze,"");
    }
    static void pathWithObstacles(int r,int c, String ans){
        if(r==1 && c==1){
            System.out.println(ans);
            return;
        }
        if(r==2 && c==2){
            return;
        }
        if(r>1){
            pathWithObstacles(r-1,c,ans+"D");
        }
        if(c>1){
            pathWithObstacles(r,c-1,ans+"R");
        }
    }

    static void kunalsApproach(int r,int c,boolean[][]maze,String ans){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(ans);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            kunalsApproach(r+1,c,maze,ans+"D");
        }
        if(c<maze[0].length-1){
            kunalsApproach(r,c+1,maze,ans+"R");
        }
    }
}
