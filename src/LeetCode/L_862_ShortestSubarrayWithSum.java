package LeetCode;

public class L_862_ShortestSubarrayWithSum {
    public int shortestSubarray(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int left=0;
        int total=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==k){
                return 1;
            }
            total+=nums[right];
            while(total>=k){
                min=Math.min(min,right-left+1);
                total-=nums[left++];
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args) {
        int[]nums={2,-1,2};
        int k=3;
        L_862_ShortestSubarrayWithSum ans=new L_862_ShortestSubarrayWithSum();
        System.out.println(ans.shortestSubarray(nums,k));
    }
}
