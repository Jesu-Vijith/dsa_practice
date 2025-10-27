package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_2379_MinimumRecolours {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int right=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        int n=blocks.length();
        int result=Integer.MAX_VALUE;
        while(right<n){
            char ch=blocks.charAt(right);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            if(right-left+1==k){
                char leftChar=blocks.charAt(left);
                int white=0;
                if(hmap.containsKey('W')){
                    white=hmap.get('W');
                }
                result=Math.min(result,white);
                hmap.put(leftChar,hmap.getOrDefault(leftChar,0)-1);
                left++;
            }
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        L_2379_MinimumRecolours ans=new L_2379_MinimumRecolours();
        System.out.println(ans.minimumRecolors(blocks,k));
    }
}
