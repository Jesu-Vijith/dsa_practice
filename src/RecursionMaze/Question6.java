package RecursionMaze;
import java.util.ArrayList;
import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        boolean[][]maze={
                            {true,true,true},
                            {true,true,true},
                            {true,true,true}
                        };

        //My approach
        //You have to repair it after learning about passing array in recursion properly
//        printMatrix(0,0,"",maze,list);

        //Kunal's approach
        int[][]path=new int[maze.length][maze[0].length];
        printMatrix2("",maze,0,0,path,1);
    }

    static void printMatrix(int r,int c,String path,boolean[][]maze,ArrayList<ArrayList<Integer>>list){
        ArrayList<ArrayList<Integer>>ansList=new ArrayList<>();
        ansList.addAll(list);
        if(r==2 && c==2){
            System.out.println(path);
            System.out.println(ansList);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            ArrayList<Integer>alist=new ArrayList<>();
            alist.add(r+1);
            alist.add(c);
            ansList.add(alist);
            printMatrix(r+1,c,path+"D",maze,ansList);
        }
        if(c<maze[0].length-1){
            ArrayList<Integer>alist=new ArrayList<>();
            alist.add(r);
            alist.add(c+1);
            ansList.add(alist);
            printMatrix(r,c+1,path+"R",maze,ansList);
        }
        if(r>0){
            ArrayList<Integer>alist=new ArrayList<>();
            alist.add(r-1);
            alist.add(c);
            ansList.add(alist);
            printMatrix(r-1,c,path+"U",maze,ansList);
        }
        if (c>0){
            ArrayList<Integer>alist=new ArrayList<>();
            alist.add(r);
            alist.add(c-1);
            ansList.add(alist);
            printMatrix(r,c-1,path+"L",maze,ansList);
        }
        maze[r][c]=true;
    }

    static void printMatrix2(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            printMatrix2(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            printMatrix2(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            printMatrix2(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            printMatrix2(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
