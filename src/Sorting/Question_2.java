package Sorting;

//You are given a binary array arr consisting only of 0s and 1s.
//Your task is to find the length of the longest contiguous subarray where the number of 0s and 1s are equal.

//        Example:
//Input: arr = [0, 1, 0, 1, 1, 1, 0]
//Output: 6
//Explanation: The subarray [0,1,0,1,1,1] has 3 zeros and 3 ones.


import java.util.HashMap;

public class Question_2 {
    public static void main(String[] args) {
        Question_2 qn2=new Question_2();
        int[]arr = {0, 1, 0, 1, 1, 1, 0};
        System.out.println(qn2.findLongestContiniousSubarray(arr));
    }

    public int findLongestContiniousSubarray(int[]arr){
        int maxLength=0;
        int ans=arr[0]==0?-1:1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0)ans=ans-1;
            else ans=ans+1;
            if(ans==0){
                Math.max(maxLength,i+1);
            }
        }
        return maxLength;
    }
}
