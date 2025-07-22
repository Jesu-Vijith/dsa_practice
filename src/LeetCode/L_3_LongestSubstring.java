package LeetCode;

import java.util.HashSet;

public class L_3_LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int left=0;
        HashSet<Character> hash=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        L_3_LongestSubstring ans=new L_3_LongestSubstring();
        System.out.println(ans.lengthOfLongestSubstring("pwwkew"));
    }


    //Failed
    public int lengthOfLongest1(String s) {
        int i=0;
        int j=s.length()-1;
        String ans= String.valueOf(s.charAt(0));
        while(i<j){
            if(!ans.contains(String.valueOf(s.charAt(j)))){
                ans+=s.charAt(j);
            }
            j--;
        }
        return ans.length();
    }

    //failed
    public int lengthOfLongest2(String s) {
        if(s.isEmpty()){
            return 0;
        }

        int first=s.length()/2-1;
        if(first<s.length()/2-1){
            first=s.length()/2;
        }
        int second=s.length()/2+1;
        if(second>s.length()-1){
            second=s.length()-1;
        }
        String ans=String.valueOf(s.charAt(s.length()/2));
        while(first!=0 && second!=s.length()-1){
            if(!ans.contains(String.valueOf(s.charAt(first)))){
                ans=s.charAt(first)+ans;
            }
            if(!ans.contains(String.valueOf(s.charAt(second)))){
                ans=ans+s.charAt(second);
            }
            first--;
            second++;
        }
        while(first!=0){
            if(!ans.contains(String.valueOf(s.charAt(first)))){
                ans=s.charAt(first)+ans;
            }
            first--;
        }
        while(second!=s.length()-1){
            if(!ans.contains(String.valueOf(s.charAt(second)))){
                ans=ans+s.charAt(second);
            }
            second--;
        }
        return ans.length();
    }
}
