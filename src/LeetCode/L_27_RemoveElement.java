package LeetCode;

import java.util.Arrays;

public class L_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        int ansCount=0;
        while(left<right){
            if(nums[right]==val){
                right--;
                ansCount++;
            }
            else if(nums[left]==val){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
                ansCount++;
            }
            else{
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return ansCount;
    }

    public static void main(String[] args) {
        L_27_RemoveElement ans=new L_27_RemoveElement();
        int []arr={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(ans.removeElement(arr,val));
    }
}
