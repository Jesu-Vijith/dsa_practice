package RecursionString.Permutations;

import java.util.ArrayList;

public class PermutationReturningArray {
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }

    static ArrayList<String> permutation(String ans,String ques){
        if(ques.isEmpty()){
            ArrayList<String>ansList= new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }
        ArrayList<String>list=new ArrayList<>();
        char ch=ques.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            list.addAll(permutation(f+ch+s,ques.substring(1)));
        }
        return list;
    }
}
