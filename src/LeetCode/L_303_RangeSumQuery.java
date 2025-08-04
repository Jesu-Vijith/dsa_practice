package LeetCode;

public class L_303_RangeSumQuery {
        int[]arr;
        public L_303_RangeSumQuery(int[] nums) {
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
