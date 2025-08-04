package LeetCode;

import java.util.Arrays;

public class L_26_RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int count=1;
        int k=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                count++;
                nums[k]=nums[i];
                i=j;
                k++;
            }
        }
        nums[k]=nums[i];
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        L_26_RemoveDuplicateFromSortedArray ans=new L_26_RemoveDuplicateFromSortedArray();
        int[]nums={0,0,1,1,1,2,2,3,3,4};
//        System.out.println(Arrays.toString(ans.inplace(nums)));
        System.out.println(ans.removeDuplicates(nums));
    }

    public int[] inplace(int[] nums) {
//        System.out.println(Arrays.toString(nums));
        int i=0;
        int k=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[k]=nums[i];
                i=j;
                k++;
            }
        }
        nums[k++]=nums[i];
        System.out.println(k);
        return nums;
    }
}
