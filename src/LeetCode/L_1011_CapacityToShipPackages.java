package LeetCode;

import java.util.Arrays;

public class L_1011_CapacityToShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int start=Arrays.stream(weights).max().getAsInt();;
        int end= Arrays.stream(weights).sum();
        int mid;
        int ans=0;
        while(start<=end){
            mid=(start+end)/2;
            int calculatedDays=calculateDays(weights,days,mid);
            if(calculatedDays<=days){
                ans=mid;
                end=mid-1;  
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public int calculateDays(int[]weights,int d,int mid){
        int tempWeight=0;
        int days=0;
        for(int weight:weights){
            if(tempWeight+weight<=mid){
                tempWeight+=weight;
            }
            else{
                days++;
                tempWeight=weight;
            }
        }
        return days+1;
    }
    public static void main(String[] args) {
        int[]weights={3,2,2,4,1,4};
        int days=3;
        L_1011_CapacityToShipPackages l1=new L_1011_CapacityToShipPackages();
        System.out.println(l1.shipWithinDays(weights,days));
        System.out.println("Ans: "+6);
    }
}
