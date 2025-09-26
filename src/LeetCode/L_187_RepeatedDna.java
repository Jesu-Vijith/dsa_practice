package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_187_RepeatedDna {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAA";
        L_187_RepeatedDna ans=new L_187_RepeatedDna();
        System.out.println(ans.findRepeatedDnaSequences(s));

    }
    public List<String> findRepeatedDnaSequences(String s) {
        int start=0;
        int end=start+10;
        int n=s.length();
        List<String>ans=new ArrayList<>();
        HashMap<String,Integer>hmap=new HashMap<>();
        while(end<n){
            String word=s.substring(start,end);
            if(hmap.containsKey(word)){
                hmap.put(word,hmap.getOrDefault(word,0)+1);
                if(hmap.get(word)==2){
                    ans.add(word);
                }
            }
            else {
                hmap.put(word, 1);
            }
            start++;
            end++;
        }
        return ans;
    }
}
