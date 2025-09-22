package LeetCode;

import java.util.Arrays;

public class L_875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int mid = 0;
        int k = 0;
        int ans = 0;
        while (min <= max) {
            mid = (max + min) / 2;
            if (isPossible(piles, h, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[]piles,int h,int mid){
        int hours=0;
        for(int pile:piles){
            hours+=pile/mid;
            if(pile%mid!=0){
                hours++;
            }
        }
        return hours<=h;
    }
    public static void main(String[] args) {
        L_875_KokoEatingBananas b1=new L_875_KokoEatingBananas();
        int[]piles={312884470};
        int h=312884469;
        int ans=0,k=10,j=20;
        System.out.println(b1.minEatingSpeed(piles,h));
    }
}
