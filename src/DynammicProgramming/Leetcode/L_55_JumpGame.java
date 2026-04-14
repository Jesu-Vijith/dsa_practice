package DynammicProgramming.Leetcode;

public class L_55_JumpGame {

     public boolean canJump1(int[] nums) {
         int goal=nums.length-1;
         for(int i=nums.length-2;i>=0;i--){
             if(i+nums[i]>=goal){
                 goal=i;
             }
         }
         return goal==0;
     }
    public boolean canJump2(int[] nums) {
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxLength){
                return false;
            }
            maxLength=Math.max(maxLength,nums[i]+i);
        }
        return true;
    }


    public boolean canJumpOwnTry(int[] nums) {
        return jump(nums,nums[0],0);
    }

    public boolean jump(int[]nums,int num,int idx){
        if(idx==nums.length-1){
            return true;
        }
        for(int i=idx+1;i<=num+idx;i++){
//            return jump(nums,nums[i],i);
             if(jump(nums,nums[i],i)){
                 return true;
             }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]nums={2,0,0};
        L_55_JumpGame j1=new L_55_JumpGame();
        System.out.println(j1.canJumpOwnTry(nums));
        System.out.println(j1.canJump1(nums));
        System.out.println(j1.canJump2(nums));
    }
}
