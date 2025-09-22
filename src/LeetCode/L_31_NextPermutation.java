package LeetCode;

import java.util.Arrays;

public class L_31_NextPermutation {

    public static void nextPermutation(int[] nums) {
        int suffix = 0;
        int preSuffix = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                suffix = i;
                preSuffix = i - 1;
                break;
            }
        }
        if (suffix == preSuffix) {
            Arrays.sort(nums);
            return;
        }
        int temp = suffix;
        int newPreSuffix = nums[suffix];
        for (int i = temp; i < nums.length; i++) {
            if (nums[i] > nums[preSuffix] && nums[i] < newPreSuffix) {
                newPreSuffix = nums[i];
                temp = i;
            }
        }
        int tempNum = nums[preSuffix];
        nums[preSuffix] = nums[temp];
        nums[temp] = tempNum;
        int end = nums.length - 1;
        while (suffix < end) {
            int num = nums[suffix];
            nums[suffix] = nums[end];
            nums[end] = num;
            suffix++;
            end--;
        }
    }


    public static void main(String[] args) {
//        int[]nums={5,4,7,5,3,2};
        int[]nums={1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
