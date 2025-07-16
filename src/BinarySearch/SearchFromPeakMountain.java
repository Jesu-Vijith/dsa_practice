package BinarySearch;

public class SearchFromPeakMountain {

    public static void main(String[] args){
        int []arr={1,2,3,4,5,3,1};
        int peak=findingPeak(arr);
        int target=3;
        int ans1=searchInFirstPart(arr,target,peak);
        if(ans1==-1){
            int ans2=searchInSecondPart(arr,target,peak);
            System.out.println(ans2);
        }
       else{
            System.out.println(ans1);
        }
    }

    private static int searchInSecondPart(int[] arr, int target, int peak) {
        int start=peak;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                start=mid+1;
            }
            if(arr[mid]<target){
                end=mid-1;
            }
        }
        return -1;

    }

    private static int searchInFirstPart(int[] arr, int target, int peak) {
        int start=0;
        int end=peak;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }

    private static int findingPeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }

}
