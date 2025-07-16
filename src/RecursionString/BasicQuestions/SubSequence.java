package RecursionString.BasicQuestions;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
      subSeq("abc","");
        ArrayList<String>list=new ArrayList<>();
        //Returning an Arraylist while passing an ArrayList as parameter
        //System.out.println(subSeqArrayList("abc","",list));

        //Returning an ArrayList without passing an ArrayList as parameter
        //System.out.println(subSeqArrayList2("abc",""));
    }

    static ArrayList<String> subSeqArrayList2(String ques,String ans){
        if(ques.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch=ques.charAt(0);

        ArrayList<String>first=subSeqArrayList2(ques.substring(1),ans+ch);
        ArrayList<String>second=subSeqArrayList2(ques.substring(1),ans);

        first.addAll(second);
        return first;
    }

    static ArrayList<String> subSeqArrayList(String ques,String ans,ArrayList<String> list){
        if(ques.isEmpty()){
            if(!ans.isEmpty()) {
                list.add(ans);
            }
            return list;
        }

        char ch=ques.charAt(0);

        subSeqArrayList(ques.substring(1),ans+ch,list);
        subSeqArrayList(ques.substring(1),ans,list);

        return list;
    }

    static void subSeq(String ques, String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);

        subSeq(ques.substring(1),ans+ch);
        subSeq(ques.substring(1),ans);
    }
}
