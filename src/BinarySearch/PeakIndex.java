package BinarySearch;

public class PeakIndex {

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,1,4,3,2,0}));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }

        return start;
    }
}
