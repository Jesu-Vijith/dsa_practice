package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[]nums=new int[]{16,17,18,3,5,2};
        LeaderInArray ans=new LeaderInArray();
        System.out.println(Arrays.toString(ans.findingLeaders(nums)));
    }
    public int[] findingLeaders(int[]nums){
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.length-1;
        list.add(nums[n]);
        int max=nums[n];
        for(int i =n-1;i>=0;i--){
            if(nums[i]>max){
                max=nums[i];
                list.add(max);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

