package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length-3;a++){
            if(a>0 && nums[a]==nums[a-1]){
                continue;
            }
            for(int b=a+1;b<nums.length-2;b++){
                if(b>a+1 && nums[b]==nums[b-1]){
                    continue;
                }
                int left=b+1;
                int right=nums.length-1;
                while(left<right){
                    long total=(long)nums[a]+nums[b]+nums[left]+nums[right];
                    if(total==target){
                        outer.add(Arrays.asList(nums[a],nums[b],nums[left],nums[right]));
                        left++;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                    }
                    else if(total<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        L_18_4Sum ans=new L_18_4Sum();
        int[]nums={1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        System.out.println(ans.fourSum(nums,target));
    }
}
