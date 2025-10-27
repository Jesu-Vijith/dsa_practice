package LeetCode;

import java.util.HashMap;

public class L_2461_MaxSumOfDistinctNumbers {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        int right=0;
        long result=0;
        long sum=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int n=nums.length;
        while(right<n){
            int num=nums[right];
            hmap.put(num,hmap.getOrDefault(num,0)+1);
            sum+=num;
            if(right-left+1==k){
                if(hmap.size()==k){
                    result=Math.max(result,sum);
                }
                int leftNum=nums[left];
                sum-=leftNum;
                hmap.put(leftNum,hmap.getOrDefault(leftNum,0)-1);
                if(hmap.get(leftNum)==0){
                    hmap.remove(leftNum);
                }
                left++;
            }
            right++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums={1,5,4,2,9,9,9};
        int k = 3;
        L_2461_MaxSumOfDistinctNumbers ans=new L_2461_MaxSumOfDistinctNumbers();
        System.out.println(ans.maximumSubarraySum(nums,k));
    }
}
