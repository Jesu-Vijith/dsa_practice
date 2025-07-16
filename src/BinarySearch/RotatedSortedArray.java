package BinarySearch;

public class RotatedSortedArray {
    public static int findingPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
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

    public static int findingTarget(int[]arr,int pivot,int target){
        if(pivot==target){
            return pivot;
        }
        if(pivot==-1){
            return binarySearch(arr,0,arr.length-1,target);
        }
        int ans=binarySearch(arr,0,pivot,target);
        if(ans==-1){
            ans=binarySearch(arr,pivot,arr.length-1,target);
        }
        return ans;
    }

    public static int binarySearch(int []arr, int start, int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};;
        int target=2;

        int pivot=findingPivot(arr);
        System.out.println(findingTarget(arr,pivot,target));
    }
}