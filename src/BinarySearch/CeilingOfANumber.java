package BinarySearch;

public class CeilingOfANumber {

    static int ceilingNumber(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(target>arr[arr.length-1]){
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
        return arr[start];
//       After the while condition is broken, start will always be pointed at the ceiling
//       element of the target...!


//        if(arr[mid]<target){
//            System.out.println(arr[start]);
//            return arr[mid+1];
//        }
//        else{
//            System.out.println(arr[start]);
//            return arr[mid];
//        }

    }
    public static void main(String[] args) {
        int[]arr={2,3,5,9,14,16,18};
        int target=10;
        System.out.println(ceilingNumber(arr,target));
    }
}
