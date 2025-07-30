package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_242_ValidAnagram {

    public boolean isAnagram1(String s, String t) {
        HashMap<Character,Integer>smap=new HashMap<>();
        HashMap<Character,Integer>tmap=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }

        return smap.equals(tmap);
    }

    public boolean isAnagram2(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch) && map.get(ch)==0){
                return false;
            }
            map.put(ch, map.get(ch)-1);
        }
        return true;
    }

    public boolean isAnagramMyTry(String s, String t) {
        int scount=0;
        int tcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(t.contains(String.valueOf(ch))){
                scount+=s.charAt(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        L_242_ValidAnagram anag=new L_242_ValidAnagram();
//        System.out.println(anag.isAnagramMyTry("ab","a"));
        System.out.println(anag.isAnagram1("anagram","nagaram"));
        System.out.println(anag.isAnagram2("anagram","nagaram"));
    }
}
