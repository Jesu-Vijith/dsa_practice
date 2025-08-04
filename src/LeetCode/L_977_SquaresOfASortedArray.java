package LeetCode;

import java.util.Arrays;

public class L_977_SquaresOfASortedArray {

    //After time-space complexity tradeoff:
    //Time complexity - O(N)
    //Space complexity - O(N)
    public int[] sortedSquares1(int[] nums) {
        int[] temp=new int[nums.length];
        Arrays.fill(temp,0);
        int left=0;
        int right=nums.length-1;
        for(int i=temp.length-1;i>=0;i--){
            int leftNum=nums[left]*nums[left];
            int rightNum=nums[right]*nums[right];
            if(leftNum>=rightNum){
                temp[i]=leftNum;
                left++;
            }
            else{
                temp[i]=rightNum;
                right--;
            }
        }
        return temp;
    }

//    Time complexity - O(N logN) , Space Complexity- O(1)
//    Loop takes O(N) and sorting takes O(N logN)
//    As the sorting time complexity dominates, the time complexity is O(N logN)
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {

    }
}
