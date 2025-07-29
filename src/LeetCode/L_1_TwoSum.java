package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_1_TwoSum {

    //O(N)
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hmap.containsKey(temp)){
                return new int[]{i,hmap.get(temp)};
            }
            else{
                hmap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    //O(N^2)
    public int[] twoSum(int[] nums, int target) {
     for (int i = 0; i < nums.length; i++) {
         for (int j = i; j < nums.length; j++) {
             if (nums[i] + nums[j] == target && i != j) {
                 return new int[]{i, j};
             }
         }
     }
     return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};
        int target=11;
        L_1_TwoSum ans=new L_1_TwoSum();
        System.out.println(Arrays.toString(ans.twoSum2(nums,target)));
    }

}
