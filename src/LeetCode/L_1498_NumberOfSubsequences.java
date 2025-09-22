package LeetCode;

import java.util.Arrays;

public class L_1498_NumberOfSubsequences {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int[]power=new int[nums.length];
        power[0]=1;
        int mod=1000000007;
        for(int i=1;i<nums.length;i++){
            power[i]=(power[i-1]*2)%mod;
        }

        int ansCount=0;
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            if(nums[left]+nums[right]<=target){
                ansCount=(ansCount+power[right-left])%mod;
                left++;
            }
            else{
                right--;
            }
        }
        return ansCount;
    }
}
