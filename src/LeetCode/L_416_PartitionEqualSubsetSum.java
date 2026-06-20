package LeetCode;

public class L_416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        float total=0;
        for(int n:nums){
            total+=n;
        }
        return partitionSum(nums,0,total/2);
    }

    public boolean partitionSum(int[]nums,int total, float ans){
        if(total==ans){
            return true;
        }
        if(nums.length==0){
            return false;
        }
        int num=nums[0];
        int[]newArr=new int[nums.length-1];
        int idx=0;
        for(int i=1;i<nums.length;i++){
            newArr[idx++]=nums[i];
        }
        boolean first=partitionSum(newArr,total+num,ans);
        boolean second=partitionSum(newArr,total,ans);
        return first||second;
    }

    public static void main(String[] args) {
        int[]nums = {1,5,11,5};
        L_416_PartitionEqualSubsetSum l1=new L_416_PartitionEqualSubsetSum();
        System.out.println(l1.canPartition(nums));
    }
}
