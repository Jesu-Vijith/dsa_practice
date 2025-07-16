package LinearSearch;

public class LinearSearchFindingIndex {
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        int[]arr={5,7,51,48,37,21,31,9,8,13,62,77,84};
        int target=100;
        int ans=LinearSearchFindingIndex.linearSearch(arr,target);
        if(ans==-2){
            System.out.println("The target element is not found");
        }
        else if(ans==-1){
            System.out.println("The array is empty");
        }
        else{
            System.out.println("Element is found in the index: "+ans);
        }
    }

}
