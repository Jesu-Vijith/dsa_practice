package LeetCode;

import java.util.HashMap;

public class L_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hmap.containsValue(i)){
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }
            else{
                hmap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hmap.containsKey(t.charAt(0))){

            }
        }
        return false;
    }
    public static void main(String[] args) {
        L_242_ValidAnagram anag=new L_242_ValidAnagram();
        anag.isAnagram("anagram","nagaram");
    }
}
