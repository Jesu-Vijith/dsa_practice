package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_30_SubstringWithConcatination {
    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[]words = {"word","good","best","good"};
        L_30_SubstringWithConcatination ans=new L_30_SubstringWithConcatination();
        System.out.println(ans.findSubstring(s,words));
    }
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer>result=new ArrayList<>();
        if(s.length()==0 || words.length==0){
            return result;
        }
        int wordsLength=words.length;
        int wordLen=words[0].length();
        int left=0;
        int right=0;
        int n=s.length();
        HashMap<String,Integer> pattern=getPattern(words);
        HashMap<String,Integer>temp=new HashMap<>();
        while(right<n){
            String word=s.substring(right,right+wordLen);
            temp.put(word,temp.getOrDefault(word,0)+1);
            if(right+wordLen-left==wordsLength*wordLen){
                check(temp,pattern);
                if(temp.equals(pattern)){
                    result.add(left);
                }
                String leftWord=s.substring(left,left+wordLen);
                temp.put(leftWord,temp.getOrDefault(leftWord,0)-1);
                if(temp.get(leftWord)==0){
                    temp.remove(leftWord);
                }
                left=left+wordLen;
            }
            right=right+wordLen;
        }
        return result;
    }

    public HashMap<String,Integer>getPattern(String[]words){
        HashMap<String,Integer>pattern=new HashMap<>();
        for(String word:words){
            pattern.put(word,pattern.getOrDefault(word,0)+1);
        }
        System.out.println("Inside Pattern:");
        for(Map.Entry<String, Integer> entry:pattern.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("===================");
        return pattern;
    }

    public void check(HashMap<String,Integer>temp, HashMap<String,Integer>pattern){
        for(Map.Entry<String, Integer> entry:temp.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        for(Map.Entry<String, Integer> entry:pattern.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }


    //======================================================================

    //Own attempt (Passed 124 testcases in leetcode)
    //TLE exceeded because it generates possible permutations and it takes so much time
    //if too many words are present
//    public static void main(String[] args) {
//        String s = "barfoofoobarthefoobarman";
//        String qn="";
//
//        String[]arr={"bar","foo","the"};
//        for(String str:arr){
//            qn+=str;
//        }
//        int qnLen=qn.length();
//        List<Integer>ansList=new ArrayList<>();
//        List<String>permutations=new ArrayList<>();
//        L_30_SubstringWithConcatination ans=new L_30_SubstringWithConcatination();
//        ans.findingPermutations(arr,"",permutations);
//        System.out.println(permutations);
//        int left=0;
//        int right=qnLen-1;
//        int n=s.length();
//        while(right<n){
//            String word=s.substring(left,right+1);
//            if(permutations.contains(word)){
//                ansList.add(left);
//            }
//            left++;
//            right++;
//        }
//        System.out.println(ansList);
//
//    }
//    public void findingPermutations(String[]arr,String ans,List<String>permutations){
//        if(arr.length==1){
//            ans=ans+arr[0];
//            permutations.add(ans);
//            return;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            String temp=arr[i];
//            int idx=0;
//            String [] remaining=new String[arr.length-1];
//            for(int j=0;j<arr.length;j++){
//                if(i!=j){
//                    remaining[idx]=arr[j];
//                    idx++;
//                }
//            }
//            findingPermutations(remaining,ans+temp,permutations);
//        }
//    }

}
