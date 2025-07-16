package RecursionMaze;

import java.util.ArrayList;


//learn the diff between your condition and kunals condition
public class Question3 {
    public static void main(String[] args) {
        pathDiagonal(3,3,"");
    }

    static void pathDiagonal(int r,int c,String ans){
        if(r==1 && c==1){
            System.out.println(ans);
            return;
        }

//        kunal condition
        if(r>1 && c>1){
            pathDiagonal(r-1,c-1,ans+"D");
        }

//        your condition
//        if(r==c){
//            pathDiagonal(r-1,c-1,ans+"D");
//        }

        if(r>1){
            pathDiagonal(r-1,c,ans+"V");
        }
        if(c>1){
            pathDiagonal(r,c-1,ans+"H");
        }

    }
}
