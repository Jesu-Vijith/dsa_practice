package BinarySearch;

public class FloorOfANumber {

    static int floorOfANumber(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(target<arr[0]){
                return -1;
            }
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[]arr={2,4,5,9,14,16,18};
        int target=10;
        System.out.println(floorOfANumber(arr,target));
    }
}
