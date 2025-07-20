package DSA_patterns;

public class SlidingWindow {
//    nums = [1,12,-5,-6,50,3], k = 4
    public static void main(String[] args) {
        int[]nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(slide(nums,k));
    }
    private static int slide(int[]nums,int k){
        int max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        System.out.println(max);
        int i=0;
        while(k!=nums.length){
            int temp=max+nums[k]-nums[i];
            if(temp>max){
                max=temp;
            }
            System.out.println(temp);
            k++;
            i++;
        }
        return max;
    }
}
