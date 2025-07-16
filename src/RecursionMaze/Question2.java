package RecursionMaze;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
//        System.out.println(findingPath(3,3,""));
//        findPathVoid(3,3,"");
//        System.out.println(returningList(3,3,""));
        System.out.println(codeByKunal(3,3,""));
    }

    //Returning String
    static String findingPath(int row,int col,String ans){
        if(row==1 && col==1){
            return ans;
        }
        if(row==1){
            return findingPath(1,col-1,ans+"R");
        }
        if(col==1){
            return findingPath(row-1,1,ans+"D");
        }
        String left=findingPath(row-1,col,ans+"D");
        String right=findingPath(row,col-1,ans+"R");
        return left+right;
    }


//    Returning Void

    static void findPathVoid(int row,int col,String ans){
        if(row==1 && col==1){
            System.out.println(ans);
            return;
        }
        if(row==1){
            findPathVoid(1,col-1,ans+"R");
            return;
        }
        if(col==1){
            findPathVoid(row-1,1,ans+"D");
            return;
        }
        findPathVoid(row-1,col,ans+"D");
        findPathVoid(row,col-1,ans+"R");
    }

    static ArrayList<String> returningList(int row,int col,String ans){
        if(row==1 && col==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String>ansList=new ArrayList<>();
        if(row==1){
            return returningList(1,col-1,ans+"R");
        }
        if(col==1){
            return returningList(row-1,1,ans+"D");
        }
        ansList.addAll(returningList(row-1,col,ans+"D"));
        ansList.addAll(returningList(row,col-1,ans+"R"));
        return ansList;
    }

    static ArrayList<String> codeByKunal(int r,int c,String ans){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String>ansList=new ArrayList<>();
        if(r>1){
            ansList.addAll(codeByKunal(r-1,c,ans+"D"));
        }
        if(c>1){
            ansList.addAll(codeByKunal(r,c-1,ans+"R"));
        }
        return ansList;
    }
}
