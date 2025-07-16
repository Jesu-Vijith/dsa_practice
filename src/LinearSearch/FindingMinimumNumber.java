package LinearSearch;

public class FindingMinimumNumber {

    static int linearSearch(int[]arr){
        int minVal=arr[0];
        for(int val:arr){
            if(val<minVal){
                minVal=val;
            }
        }
        return minVal;
    }
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(linearSearch(arr));
    }
}
