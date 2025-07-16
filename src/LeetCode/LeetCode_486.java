package LeetCode;

public class LeetCode_486 {
    public static void main(String[] args) {
        int[]nums={1,5,233,7};
        int start=0;
        int end=nums.length-1;
        int player1=0;
        int player2=0;
        System.out.println(predictWinner(nums,start,end,player1,player2));
    }

    static boolean predictWinner(int[]nums,int start,int end,int player1,int player2){
        if(nums[start]>nums[end]){
            player1=player1+nums[start];
            start++;
        }
        else {
            player1=player1+nums[end];
            end--;
        }
        if(nums[start]>nums[end]){
            player2=player2+nums[start];
            start++;
        }
        else{
            player2=player2+nums[end];
            end--;
        }
        if(start>=end){
            return player1 >= player2;
        }
        else{
            return predictWinner(nums,start,end,player1,player2);
        }
    }
}
