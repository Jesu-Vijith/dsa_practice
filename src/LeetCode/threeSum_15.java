package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {
    //int[] nums={-1,0,1,2,-1,-4};
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0;
        int j=1;
        int k=nums.length-1;
        List<List<Integer>> outer=new ArrayList<>();
        while(i<k){
            while(j!=k){
                System.out.println(i+" "+j+" "+k);
                System.out.println(nums[i]+nums[j]+nums[k]);
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer>inner=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    outer.add(inner);
                    break;
                }
                else{
                    k--;
                }
            }
            i=j;
            j++;
            k=nums.length-1;
        }
        return outer;
    }

    public static void main(String[] args) {
        threeSum_15 sum=new threeSum_15();
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(sum.threeSum(nums));
    }
}
