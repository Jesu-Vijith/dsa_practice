package LeetCode;

import java.util.Arrays;

public class L_1482_MinDaysToMakeBouquets {
    // Return the number of maximum bouquets that can be made on day mid.
//    private int getNumOfBouquets(int[] bloomDay, int mid, int k) {
//        int numOfBouquets = 0;
//        int count = 0;
//
//        for (int i = 0; i < bloomDay.length; i++) {
//            // If the flower is bloomed, add to the set. Else reset the count.
//            if (bloomDay[i] <= mid) {
//                count++;
//            } else {
//                count = 0;
//            }
//
//            if (count == k) {
//                numOfBouquets++;
//                count = 0;
//            }
//        }
//
//        return numOfBouquets;
//    }
//
//    public int minDays(int[] bloomDay, int m, int k) {
//        int start = 0;
//        int end = 0;
//        for (int day : bloomDay) {
//            end = Math.max(end, day);
//        }
//
//        int minDays = -1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            if (getNumOfBouquets(bloomDay, mid, k) >= m) {
//                minDays = mid;
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//
//        return minDays;
//    }
    public int minDays(int[] bloomDay, int m, int k) {
        int start=1;
        int end= Arrays.stream(bloomDay).max().getAsInt();
        int mid=0;
        int ansDays=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(getNumOfBouquets(bloomDay,m,k,mid)>=m){
                ansDays=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ansDays;
    }
    public int getNumOfBouquets(int[]bloomDay,int m,int k,int mid){
        int count=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                bouquets=0;
                count=0;
            }
        }
        return bouquets;
    }

    public static void main(String[] args) {
        L_1482_MinDaysToMakeBouquets ans = new L_1482_MinDaysToMakeBouquets();
        int[]bloomDay={1,10,3,10,2};
        int k=1,m=3;
        System.out.println(ans.minDays(bloomDay,m,k));
    }
}

