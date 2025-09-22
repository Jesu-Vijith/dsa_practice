package LeetCode;

public class L_845_LongestMountainInArray {
    public int longestMountain(int[]arr){
        int length=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && i<arr.length-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                length=Math.max(findingLength(arr,i),length);
            }
        }
        return length;
    }

    private int findingLength(int[]arr,int pivot){
        int left=0;
        int right=0;
        int temp=pivot;
        while(temp>0 && arr[temp]>arr[temp-1]){
            left++;
            temp--;
        }
        temp=pivot;
        while(temp<arr.length-1 && arr[temp]>arr[temp+1]){
            right++;
            temp++;
        }
        return left+right+1;
    }


    public static void main(String[] args) {
        int[]arr={1, 3, 2, 5, 7, 4, 6, 8, 7, 2, 3, 5, 4, 6, 1};
        L_845_LongestMountainInArray ans=new L_845_LongestMountainInArray();
        System.out.println(ans.longestMountain(arr));
    }
}
