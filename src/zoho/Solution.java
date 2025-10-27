package zoho;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int firstOccurence(String txt, String pat) {
        HashMap<Character,Integer> pattern=new HashMap<>();
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<pat.length();i++){
            char ch=pat.charAt(i);
            pattern.put(ch,pattern.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=0;
        int n=txt.length();
        while(right<n){
            char rightChar=txt.charAt(right);
            hmap.put(rightChar,hmap.getOrDefault(rightChar,0)+1);
            if(right-left+1==pat.length()){
                if(pattern.equals(hmap)){
                    return left;
                }
                char leftChar=txt.charAt(left);
                hmap.put(leftChar,hmap.get(leftChar)-1);
                if(hmap.get(leftChar)==0){
                    hmap.remove(leftChar);
                }
                left++;
            }
            right++;
//            for(Map.Entry<Character,Integer>entry:hmap.entrySet()){
//                System.out.println(entry.getKey()+" "+entry.getValue());
//            }
//            System.out.println();
        }
        return -1;
    }

    public static void main(String[] args) {
        String txt="leetcode";
        String pat="leeto";
        Solution sln1=new Solution();
        System.out.println(sln1.firstOccurence1(txt,pat));
    }

    int firstOccurence1(String txt, String pat) {
        int left=0;
        int n=txt.length();
        int right=pat.length()-1;
        while(right<=n){
            String temp=txt.substring(left,right+1);
            System.out.println(temp);
            System.out.println(temp.equals(pat));
            if(temp.equals(pat)){
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }

}
