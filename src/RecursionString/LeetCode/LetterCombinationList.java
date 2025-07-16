package RecursionString.LeetCode;

import java.util.ArrayList;

public class LetterCombinationList {
    public static void main(String[] args) {
        System.out.println(letterCombo("",""));
    }
    static ArrayList<String> letterCombo(String ans, String ques){
        if(ques.isEmpty()){
            ArrayList<String>ansList= new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }
        ArrayList<String>list=new ArrayList<>();
        int digit=ques.charAt(0)-'0';
        int start=digit>=8?(digit-2)*3+1:(digit-2)*3;
        int end=digit<7?(digit*3)-3:(digit*3)-2;
        if(digit==9){
            end=(digit*3)-1;
        }
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            if(digit==1){
                ArrayList<String>ansList=letterCombo(ans,ques.substring(1));
                list.addAll(ansList);
            }
            else {
                ArrayList<String>ansList=letterCombo(ans + ch, ques.substring(1));
                list.addAll(ansList);
            }
        }
        return list;
    }
}