package LeetCode;

public class L_121_BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<prices.length;j++){
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
        System.out.println(buy.maxProfit(nums));
    }
}
