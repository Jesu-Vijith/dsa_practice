package LeetCode;

public class L_209_MinimumSizeSubArray {

    // O(N) time complexity
    public int minSubArray(int target,int[]nums){
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=nums[left++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }



    //O(N^2) time complexity
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        while(i<nums.length){
            int num=0;
            for(int k=i;k<=j;k++){
                num+=nums[k];
            }
            if(num<target){
                if(j==nums.length-1){
                    i++;
                    continue;
                }
                j++;
            }
            else if(num>target){
                i++;
            }
            else{
                min=Math.min(min,j-i+1);
                i++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        L_209_MinimumSizeSubArray ans=new L_209_MinimumSizeSubArray();
        int[]nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(ans.minSubArrayLen(target,nums));
        System.out.println(ans.minSubArray(target,nums));
    }
}
