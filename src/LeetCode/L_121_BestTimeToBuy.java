package LeetCode;

public class L_121_BestTimeToBuy {

    //O(N)
    public int maxProfit2(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }

    //My own try and time limit exceeded (O(N^2))
    public int maxProfit1(int[] prices) {
        int max=0;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                int temp=prices[i]-prices[j];
                if(temp>max){
                    max=temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        L_121_BestTimeToBuy buy=new L_121_BestTimeToBuy();
        int[]nums={7,1,5,3,6,4};
//        System.out.println(buy.maxProfit1(nums));
        System.out.println(buy.maxProfit2(nums));
    }
}
