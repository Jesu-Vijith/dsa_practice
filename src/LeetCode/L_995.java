package LeetCode;

public class L_995 {
public int minKBitFlips(int[] nums, int k) {
    var flips = 0;
    var flipCount = 0;
    var n = nums.length;
    var isFlipped = new boolean[n];

    for (var i = 0; i < n; i++) {
        var left = i - k;
        var right = i + k;


        if (left >= 0 && isFlipped[left])
            flipCount--;

        // If flipCount is even and num = 1, it means that num has changed from original state of 1, so do nothing
        if (isEven(flipCount) && nums[i] == 1)
            continue;
        // If flipCount is odd and num = 0, it means that num has changed from original state of 0 to 1, so do nothing
        if (!isEven(flipCount) && nums[i] == 0)
            continue;
        // flipping can't be done because flipping window is out of bounds
        if (right > n)
            return -1;

        flips++;
        flipCount++;
        isFlipped[i] = true;
    }

    return flips;
}

private boolean isEven(int x) {
    System.out.println((x&1)==0);
    return (x & 1) == 0;
}

    public static void main(String[] args) {
        L_995 ans=new L_995();
        int[]nums={0,0,0,1,0,1,1,0};
        int k=3;
        System.out.println(ans.minKBitFlips(nums,k));
    }
}
