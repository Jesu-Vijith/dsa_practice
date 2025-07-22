package DSA_patterns;

public class SlidingWindow {
//    nums = [1,12,-5,-6,50,3], k = 4
    public static void main(String[] args) {
        int[]nums={0,4,0,3,2};
        int k=1;
        System.out.println(slide(nums,k));
    }


    private static int slide(int[]nums,int k){
        int max=0;
        for(int i=0;i<k;i++) {
            max += nums[i];
        }
        int start=0;
        int temp=max;
        for(int i=k;i<nums.length;i++){
            temp=temp+nums[i]-nums[start];
            if(temp>max){
                max=temp;
            }
            start++;
        }
        return max;
    }
}
