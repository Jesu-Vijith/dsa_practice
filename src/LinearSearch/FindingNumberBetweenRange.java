package LinearSearch;

public class FindingNumberBetweenRange {
    static int linearSearch(int[]arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=-7;
        int start=1;
        int end=4;
        System.out.println(linearSearch(arr,target,start,end));
    }
}
