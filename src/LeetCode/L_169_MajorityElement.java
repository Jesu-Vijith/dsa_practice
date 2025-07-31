package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class L_169_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int n:nums){
            hmap.put(n, hmap.getOrDefault(n,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int key=0;
        for(Map.Entry<Integer,Integer>map:hmap.entrySet()){
            if(map.getValue()>max){
                max=map.getValue();
                key=map.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        L_169_MajorityElement l1=new L_169_MajorityElement();
        int[]nums={3,3,4};
        System.out.println(l1.majorityElement(nums));
    }
}
