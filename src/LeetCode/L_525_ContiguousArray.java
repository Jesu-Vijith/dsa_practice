package LeetCode;

public class L_525_ContiguousArray {
    public static void main(String[] args) {
        L_525_ContiguousArray ans=new L_525_ContiguousArray();
        int[]nums={0,1,0,1,0,1};
        System.out.println(ans.findMaxLength(nums));
    }
    public int findMaxLength(int[]nums){
        int len=0;
        for(int i=0;i<nums.length;i++){
            int zero=0;
            int one=0;
            for (int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zero++;
                }
                if(nums[j]==1){
                    one++;
                }
                if(zero==one){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
}
