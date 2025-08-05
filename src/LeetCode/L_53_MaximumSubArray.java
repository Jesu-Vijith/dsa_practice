package LeetCode;

public class L_53_MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxNum=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            maxNum=Math.max(maxNum+nums[i],nums[i]);
            result=Math.max(result,maxNum);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
