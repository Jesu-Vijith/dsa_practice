package LeetCode;

public class L_525_ContiguousArray {
    public static void main(String[] args) {
        L_525_ContiguousArray ans=new L_525_ContiguousArray();
        int[]nums={0,1,0,1,0,1};
        System.out.println(ans.findMaxLength1(nums));
        System.out.println(ans.findMaxLength2(nums));
    }


    public int findMaxLength2(int[]nums){
        return 0;
    }


    //O(N^2) - Time limit exceeded
    public int findMaxLength1(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int zeros=0;
            int ones=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    ones++;
                }
                if(nums[j]==0){
                    zeros++;
                }
                if(ones==zeros){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
