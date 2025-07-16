package RecursionBasic;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[]arr={-18,-16,-10,-2,0,11,22,33,43,51,62,74,81,98};
        int target=51;
        int start=0;
        int end=arr.length-1;
        System.out.println(binarySearchUsingRecursion(arr,target,start,end));
    }

    static int binarySearchUsingRecursion(int[]arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearchUsingRecursion(arr,target,mid+1,end);
        }
        else{
            return binarySearchUsingRecursion(arr,target,start,mid-1);
        }
    }
}
