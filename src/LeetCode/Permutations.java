package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>>permute(int[]nums){
        List<List<Integer>>result=new ArrayList<>();
        if(nums.length==1){
            List<Integer>list=new ArrayList<>();
            list.add(nums[0]);
            result.add(list);
            return result;
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int[]remaining=new int[nums.length-1];
            int index=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    remaining[index]=nums[j];
                    index++;
                }
            }
            List<List<Integer>>newPermute=permute(remaining);
            System.out.println("New permute: "+newPermute);
            for(List<Integer>p:newPermute){
                p.add(num);
            }
            result.addAll(newPermute);
            System.out.println("result: "+result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3};
        System.out.println(permute(nums));
    }
}
