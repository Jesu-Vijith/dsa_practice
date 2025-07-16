package BinarySearch;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println(arr[0] < arr[arr.length - 1]?"Ascending":"Descending");
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[0] < arr[arr.length - 1]) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr1={-18,-16,-10,-2,0,11,22,33,43,51,62,74,81,98};
        int[]arr2={98,81,74,62,51,43,33,22,11,0,-2,-10,-16,-18};
        int target=-10;
        System.out.println(orderAgnosticBinarySearch(arr2,target));
    }
}
