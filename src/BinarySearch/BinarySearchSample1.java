package BinarySearch;

public class BinarySearchSample1 {

    static int binarySearch(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={-18,-16,-10,-2,0,11,22,33,43,51,62,74,81,98};
        System.out.println(binarySearch(arr,51));
    }
}
