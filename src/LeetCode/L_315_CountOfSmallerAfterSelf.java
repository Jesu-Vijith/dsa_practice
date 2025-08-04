package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_315_CountOfSmallerAfterSelf {

//    Time complexity- O(N^2) - time limit exceeded in leetcode
    public List<Integer> countSmaller(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                list.add(0);
                break;
            }
            int count=0;
            int num=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<num){
                    count++;
                }
            }
            list.add(count);

        }
        Arrays.sort(nums);
        return list;
    }
}
