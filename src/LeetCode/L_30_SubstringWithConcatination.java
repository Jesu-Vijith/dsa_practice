package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L_30_SubstringWithConcatination {

    //Own attempt (Passed 124 testcases in leetcode)
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String qn="";

        String[]arr={"bar","foo","the"};
        for(String str:arr){
            qn+=str;
        }
        int qnLen=qn.length();
        List<Integer>ansList=new ArrayList<>();
        List<String>permutations=new ArrayList<>();
        L_30_SubstringWithConcatination ans=new L_30_SubstringWithConcatination();
        ans.findingPermutations(arr,"",permutations);
        System.out.println(permutations);
        int left=0;
        int right=qnLen-1;
        int n=s.length();
        while(right<n){
            String word=s.substring(left,right+1);
            if(permutations.contains(word)){
                ansList.add(left);
            }
            left++;
            right++;
        }
        System.out.println(ansList);

    }
    public void findingPermutations(String[]arr,String ans,List<String>permutations){
        if(arr.length==1){
            ans=ans+arr[0];
            permutations.add(ans);
            return;
        }

        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            int idx=0;
            String [] remaining=new String[arr.length-1];
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    remaining[idx]=arr[j];
                    idx++;
                }
            }
            findingPermutations(remaining,ans+temp,permutations);
        }
    }

}
