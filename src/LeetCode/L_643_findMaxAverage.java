package LeetCode;

public class L_643_findMaxAverage {
//    public double findMaxAverage(int[] nums, int k) {
//        double max=0;
//        int avg=k;
//        for(int i=0;i<k;i++){
//            max+=nums[i];
//        }
//        int i=0;
//        while(k<nums.length){
//            double temp=max+nums[k]-nums[i];
//            if(temp>max){
//                max=temp;
//            }
//            i++;
//            k++;
//        }
//        return max/avg;
//    }
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int start=0;
        double temp=max;
        for(int i=k;i<nums.length;i++){
            temp=temp+nums[i]-nums[start];
            start++;
            if(temp>max){
                max=temp;
            }
        }
        return max/k;
    }

    public static void main(String[] args) {
        L_643_findMaxAverage f1=new L_643_findMaxAverage();
        int[]nums={0,4,0,3,2};
        int k=1;
        System.out.println(f1.findMaxAverage(nums,k));
    }
}
