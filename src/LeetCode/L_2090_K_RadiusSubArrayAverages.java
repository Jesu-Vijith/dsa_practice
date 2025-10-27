package LeetCode;

import java.util.Arrays;

public class L_2090_K_RadiusSubArrayAverages {
    public int[] getAveragesUsingPrefixSum(int[] nums, int k) {
        int n = nums.length;
        int windowSize = 2 * k + 1;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        if (n < windowSize) {
            return ans;
        }

        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = k; i + k < n; ++i) {
            ans[i] = (int) ((prefixSum[i + k + 1] - prefixSum[i - k]) / windowSize);
        }

        return ans;
    }

    public int[] getAveragesUsingSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int windowSize = 2 * k + 1;

        long windowSum = 0;
        int[] result = new int[n];
        Arrays.fill(result,-1);

        if (n < windowSize) {
            return result;
        }

        for (int i = 0; i < n; ++i) {
            windowSum += nums[i]; // Add nums[i] to the window sum

            if (i - windowSize >= 0) {
                windowSum -= nums[i - windowSize]; // Remove nums[i - windowSize] from the window sum
            }

            if (i >= windowSize - 1) {
                result[i - k] = (int) (windowSum / windowSize); // Calculate and store the average in the result
            }
        }

        return result;
    }

    public int[] getAveragesMyOwnAttempt(int[] nums, int k) {
        int left=0;
        int right=0;
        int windowSum=0;
        int n=nums.length;
        int [] ans=new int[n];
        for(int idx=0;idx<n;idx++){
            if(idx<k || idx>=n-k){
                ans[idx]=-1;
            }
            else{
                windowSum=Arrays.stream(nums,left,right+k+1).sum();
                windowSum=windowSum/((right+k+1)-left);
                ans[idx]=windowSum;
                left++;
            }
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        L_2090_K_RadiusSubArrayAverages ans=new L_2090_K_RadiusSubArrayAverages();
        System.out.println(Arrays.toString(ans.getAveragesUsingPrefixSum(nums,k)));
        System.out.println(Arrays.toString(ans.getAveragesUsingSlidingWindow(nums,k)));
        System.out.println(Arrays.toString(ans.getAveragesMyOwnAttempt(nums,k)));
    }
}
