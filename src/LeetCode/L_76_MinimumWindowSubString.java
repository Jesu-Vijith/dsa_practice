package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_76_MinimumWindowSubString {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char ch:t.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(HashMap.Entry<Character, Integer> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("---------------------------------------");
        int left=0;
        int length=Integer.MAX_VALUE;
        int n=s.length();
        int count=0;
        int needed=t.length();
        String ans="";
        for(int right=0;right<n;right++){
            char rightChar=s.charAt(right);
            System.out.println("RightChar: "+rightChar);
            if(hmap.containsKey(rightChar)){
                if(hmap.get(rightChar)>0){
                    count++;
                }
                hmap.put(rightChar,hmap.get(rightChar)-1);
            }
            while(needed==count){
                if(length>right-left+1){
                    ans=s.substring(left,right+1);
                    length=right-left+1;
                }
                char leftChar=s.charAt(left);
                System.out.println("LeftChar: "+leftChar);
                if(hmap.containsKey(leftChar)){
                    hmap.put(leftChar,hmap.getOrDefault(leftChar,0)+1);
                    if( hmap.get(leftChar)>0) {
                        count--;
                    }

                }
                left++;
            }
            System.out.println("Count: "+count);
            System.out.println("left: "+left+"  "+"right: "+right+" "+ans);
            for(HashMap.Entry<Character, Integer> entry : hmap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            System.out.println("---------------------------------------------------------");
        }
        return ans;
    }

    public static void main(String[] args) {
        L_76_MinimumWindowSubString ans=new L_76_MinimumWindowSubString();
        String s= "ADOBECODEBANC", t = "ABC";
        System.out.println(ans.minWindow(s,t));
    }
}
