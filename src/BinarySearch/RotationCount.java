package BinarySearch;

public class RotationCount {
    public static int findingPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            if(arr[mid]>arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int pivot=findingPivot(arr);
        System.out.println("Rotation Count: "+(pivot+1));

    }
}
