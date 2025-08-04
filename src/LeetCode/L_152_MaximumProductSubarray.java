package LeetCode;

public class L_152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            maxProd=Math.max(prod,maxProd);
            System.out.println(i+" : "+maxProd);
        }
        return maxProd;
    }

    public static void main(String[] args) {
        L_152_MaximumProductSubarray ans=new L_152_MaximumProductSubarray();
        int[]nums={2,3,-2,4};
        System.out.println(ans.maxProduct(nums));
    }
}
