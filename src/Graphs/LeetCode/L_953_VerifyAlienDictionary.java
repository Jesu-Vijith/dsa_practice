package Graphs.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class L_953_VerifyAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<order.length();i++){
            hmap.put(order.charAt(i),i);
        }
        for(int second=1;second<words.length;second++){
            int first=second-1;
            String firstWord=words[first];
            String secondWord=words[second];
            int length=Math.min(firstWord.length(),secondWord.length());
            int i=0;
            while(i<length && firstWord.charAt(i)==secondWord.charAt(i)){
                i++;
            }
            if(i<length){
                if(hmap.get(firstWord.charAt(i)) > hmap.get(secondWord.charAt(i))) {
                    return false;
                }
            }
            else if(firstWord.length()>secondWord.length()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        L_953_VerifyAlienDictionary l1=new L_953_VerifyAlienDictionary();
        String [] words = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "zkgwaverfimqxbnctdplsjyohu";
        System.out.println(l1.isAlienSorted(words,order));
    }
}
