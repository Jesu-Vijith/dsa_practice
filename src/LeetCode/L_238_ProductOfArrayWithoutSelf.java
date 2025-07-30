package LeetCode;

import java.util.Arrays;

public class L_238_ProductOfArrayWithoutSelf {
    public int[] productExceptSelf(int[] nums) {
        int[]output=new int[nums.length];
        Arrays.fill(output, 1);
        int left=1;
        for(int i=0;i<output.length;i++){
            output[i]*=left;
            left*=nums[i];
        }
        int right=1;
        for(int i= nums.length-1;i>=0;i--){
            output[i]*=right;
            right*=nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        L_238_ProductOfArrayWithoutSelf l1=new L_238_ProductOfArrayWithoutSelf();
        System.out.println(Arrays.toString(l1.productExceptSelf(nums)));
    }
}
