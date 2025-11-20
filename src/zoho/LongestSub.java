package zoho;

import java.util.HashMap;

public class LongestSub {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        LongestSub l1=new LongestSub();
        System.out.println(l1.longestSubString(s,k));
    }

    public int longestSubString(String s,int k){
        if(s.isEmpty() || k<0)return 0;
        int answer=0;
        HashMap<Character,Integer>hmap=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            while(hmap.size()>k){
                char leftChar=s.charAt(left);
                hmap.put(leftChar,hmap.get(leftChar)-1);
                if(hmap.get(leftChar)==0){
                    hmap.remove(leftChar);
                }
                left++;
            }
            if(hmap.size()==k)answer=Math.max(right-left+1,answer);
        }
        return answer;
    }
}
