package LeetCode;

public class Range_sum_query_303 {
        int[]arr;
        public Range_sum_query_303(int[] nums) {
            arr=new int[nums.length];
            int temp=0;
            for(int i=0;i<nums.length;i++){
                temp+=nums[i];
                arr[i]=temp;
            }
        }
        public int sumRange(int left, int right) {
            int temp=0;
            if(left==0){
                return arr[right];
            }
            return arr[right]-arr[left-1];
        }
}
