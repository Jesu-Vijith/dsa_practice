package LeetCode;

import java.util.HashMap;

public class L_992_SubarraysWithKDifferentIntegers {
//    Time Complexity O(N^2) time limit exceeded
//    Space Complexity O(N)
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> hmap;
        int output=0;
        for(int i=0;i<nums.length;i++){
            hmap=new HashMap<>();
            int idx=i;
            while(idx<nums.length){
                hmap.put(nums[idx],hmap.getOrDefault(nums[idx],0)+1);
                if(hmap.size()==k){
                    output++;
                }
                idx++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        L_992_SubarraysWithKDifferentIntegers ans=new L_992_SubarraysWithKDifferentIntegers();
        int[]nums={1,2,1,3,4};
        int k = 2;
        System.out.println(ans.subarraysWithKDistinct(nums,k));
        //Proper Approach:
        System.out.println(ans.helper(nums,k)-ans.helper(nums,k-1));
    }

    public int helper(int[]nums,int k){
        HashMap<Integer,Integer>hmap=new HashMap<>();
        int left=0;
        int right=0;
        int n=nums.length;
        int output=0;
        while(right<n){
            hmap.put(nums[right],hmap.getOrDefault(nums[right],0)+1);
            while(hmap.size()>k){
                hmap.put(nums[left],hmap.get(nums[left])-1);
                if(hmap.get(nums[left])==0){
                    hmap.remove(nums[left]);
                }
                left++;
            }
            output=output+right-left+1;
            right++;
        }
        return output;
    }
}
