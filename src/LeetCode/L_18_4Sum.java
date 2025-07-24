package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int a=0;
        int b=1;
        int c=2;
        int d=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        while(a<d){
            while(c>b && b<d){
                int total=nums[a]+nums[b]+nums[c]+nums[d];
                System.out.println(nums[a]+" "+nums[b]+" "+nums[c]+" "+nums[d]+" total: "+total);
                if(b>1 && nums[b]==nums[b-1]){
                    break;
                }
                if(total<target){
                    b++;
                }
                else if(total>target){
                    c--;
                }
                else{
                    list.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                    b++;
                    while(c<d && nums[b]==nums[b-1]){
                        b++;
                    }
                }
            }
            a++;
            b=a+1;
            c=b+1;
            d=nums.length-1;
        }
        return list;
    }

    public static void main(String[] args) {
        L_18_4Sum ans=new L_18_4Sum();
        int[]nums={1,0,-1,0,-2,2};
        System.out.println(ans.fourSum(nums,0));
    }
}
